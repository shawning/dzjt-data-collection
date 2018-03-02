package com.dzjt.customer.service;

import com.dzjt.base.Util.DateUtils;
import com.dzjt.base.constant.FileConfig;
import com.dzjt.base.constant.SFTPConfigs;
import com.dzjt.customer.entity.Customer;
import com.dzjt.customer.mapper.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    private CustomerMapper customerMapper;// 注入dao
    @Autowired
    private FileConfig fileConfig;
    @Autowired
    private SFTPConfigs sftpConfigs;

    public List getCustomerListYesterday(){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("createDate", DateUtils.getLastDate1());
        List<Customer> list = customerMapper.getCustomerListYesterday(params);
        if(list!=null&&list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    /**
     * 分页查询数据
     * @return
     */
    public List getCustomerListHistory(int from,int range){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("from", from);
        params.put("to",range);
        List<Customer> orderPage = customerMapper.getCustomerListHistory(params);
        if(orderPage!=null&&orderPage.size()>0){
            return orderPage;
        }else{
            return null;
        }
    }

    public static void main(String args[]) {
        log.error("错误信息","hihihih");
//        CustomerService service = new CustomerService();
//        service.zipTxT("D:/dzjt/" + File.separator + DateUtils.getLastDates(), "D:/dzjt/", "123456");
    }
}