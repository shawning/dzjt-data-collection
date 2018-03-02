package com.dzjt.timer.service;

import com.alibaba.fastjson.JSON;
import com.dzjt.base.Util.DateUtils;
import com.dzjt.base.Util.EncryptZipUtil;
import com.dzjt.base.Util.FileUtils;
import com.dzjt.base.Util.SFTPUtils;
import com.dzjt.base.constant.Constant;
import com.dzjt.base.constant.FileConfig;
import com.dzjt.base.constant.SFTPConfigs;
import com.dzjt.carUser.entity.CarInfo;
import com.dzjt.carUser.entity.CarUser;
import com.dzjt.carUser.mapper.CarInfoMapper;
import com.dzjt.carUser.mapper.CarUserMapper;
import com.dzjt.customer.entity.Customer;
import com.dzjt.customer.mapper.CustomerMapper;
import com.dzjt.order.entity.MovefieldOrder;
import com.dzjt.order.entity.Order;
import com.dzjt.order.mapper.MovefieldOrderMapper;
import com.dzjt.order.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/4 0004.
 */
@Transactional
@Service
public class DailyTaskService {
    private static final Logger log = LoggerFactory.getLogger(TaskService.class);
    @Autowired
    private CustomerMapper customerMapper;// 注入dao
    @Autowired
    private CarUserMapper carUserMapper;
    @Autowired
    private OrderMapper orderMapper;// 注入dao
    @Autowired
    private CarInfoMapper carInfoMapper;
    @Autowired
    private MovefieldOrderMapper movefieldOrderMapper;
    @Autowired
    private FileConfig fileConfig;
    @Autowired
    private SFTPConfigs sftpConfigs;


    /**
     * 每日定时任务，把前一天的数据打包上传
     */
    public void doDailyTask() {
        String filePath = isExistFileDir();
        Map<String, Object> params = null;
        String yesterday = DateUtils.getLastDate1();//昨日时间
        int from = 0;
        //客户信息
        params = new HashMap<String, Object>();
        params.put("createDate", yesterday);
        List<Customer> list = customerMapper.getCustomerListYesterday(params);
        if (list != null && list.size() > 0) {
            /**
             * 处理生文件
             */
            writeDateToTxt(JSON.toJSONString(list), "customer", from + "", filePath);
        }
        //司机信息
        params = new HashMap<String, Object>();
        params.put("registerDate", yesterday);
        List<CarUser> carUserList = carUserMapper.getCarUserListYesterday(params);
        if (carUserList != null && carUserList.size() > 0) {
            /**
             * 处理生文件
             */
            writeDateToTxt(JSON.toJSONString(carUserList), "carUser", from + "", filePath);
        }
        //订单信息
        params = new HashMap<String, Object>();
        params.put("callDate", yesterday);
        List<Order> orderList = orderMapper.getOrderListYesterday(params);
        if (orderList != null && orderList.size() > 0) {
            /**
             * 处理生文件
             */
            writeDateToTxt(JSON.toJSONString(orderList), "order", from + "", filePath);
        }
        //搬场司机信息
        params = new HashMap<String, Object>();
        params.put("createTime", yesterday);
        List<CarInfo> carInfoList = carInfoMapper.getCarInfoListYesterday(params);
        if (carInfoList != null && carInfoList.size() > 0) {
            /**
             * 处理生文件
             */
            writeDateToTxt(JSON.toJSONString(carInfoList), "bc_carUser", from + "", filePath);
        }
        //搬场订单
        params = new HashMap<String, Object>();
        params.put("createTime", yesterday);
        List<MovefieldOrder> movefieldOrderList = movefieldOrderMapper.getMovefieldOrderListYesterday(params);
        if (movefieldOrderList != null && movefieldOrderList.size() > 0) {
            /**
             * 处理生文件
             */
            writeDateToTxt(JSON.toJSONString(movefieldOrderList), "bc_order", from + "", filePath);
        }
        //文件打包zip，加密上传到sftp服务器
        try {
            String zipFilePath = zipTxT(filePath, fileConfig.getBasepath(), fileConfig.getKey());
            Map<String, String> sftpDetails = new HashMap<String, String>();
            sftpDetails.put("SFTP_REQ_HOST", sftpConfigs.getIp());
            sftpDetails.put("SFTP_REQ_USERNAME", sftpConfigs.getUsername());
            sftpDetails.put("SFTP_REQ_PASSWORD", sftpConfigs.getPassword());
            sftpDetails.put("SFTP_REQ_PORT", sftpConfigs.getPort());
            File keyFile = ResourceUtils.getFile(sftpConfigs.getPrivatekey());
            sftpDetails.put("SFTP_REQ_PRIVATE_KEY", keyFile.getPath());
            SFTPUtils.uploadFile(zipFilePath, sftpConfigs.getUploadpath(), sftpDetails);
            log.info("---------------每日任务：" + yesterday + ",上传成功--------------");
        } catch (Exception e) {
            e.printStackTrace();
            log.error(this.getClass().getName(), e);
        }
    }


    /**
     * 判断是否有该文件夹
     *
     * @return
     */
    public String isExistFileDir() {
        String re = "";
        try {
            String path = fileConfig.getBasepath() + File.separator + DateUtils.getLastDates();
            File file = new File(path);
            boolean result = FileUtils.findByFilepath(file);
            if (!result) {
                FileUtils.createDir(path);
            }
            re = path;
        } catch (Exception e) {
        }
        return re;
    }

    /**
     * 写文件
     *
     * @param data//jsonArray字符串
     * @param type//customer,carUser,order
     * @param range//0-10000,10000-20000
     * @param
     * @return
     */
    public boolean writeDateToTxt(String data, String type, String range, String filePath) {
        boolean reResult = true;
        String path = fileConfig.getBasepath();
        filePath = filePath + File.separator + type + range + Constant.SUFFIX_TXT;
        boolean flag = FileUtils.writeTxtFile(data, filePath);
        if (!flag) {
            reResult = false;
//            logger.info(filePath + "失败");
        }
        return reResult;
    }

    /**
     * 打包Zip
     *
     * @param filePath
     * @param zipFilePath
     * @param password
     * @return
     */
    public String zipTxT(String filePath, String zipFilePath, String password) {
        try {
            String zipPath = zipFilePath + File.separator + DateUtils.getLastDates() + Constant.SUFFIX_ZIP;
            EncryptZipUtil.zip(filePath, zipPath, password);
            return zipPath;
        } catch (Exception e1) {
            e1.printStackTrace();
            return null;
        }
    }
}
