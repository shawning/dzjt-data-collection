package com.dzjt.carUser.service;

import com.dzjt.base.Util.DateUtils;
import com.dzjt.carUser.entity.CarUser;
import com.dzjt.carUser.mapper.CarUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/4 0004.
 */
@Transactional
@Service
public class CarUserService {
    private static final Logger log = LoggerFactory.getLogger(CarUserService.class);
    @Autowired
    private CarUserMapper carUserMapper;
    /**
     * 获取昨天的司机数据
     * @return
     */
    public List getCarUserListYesterday(){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("registerDate", DateUtils.getLastDate1());
        List<CarUser> list = carUserMapper.getCarUserListYesterday(params);
        if(list!=null&&list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    /**
     * 分页查询数据
     * @param from
     * @param to
     * @return
     */
    public List getCarUserListHistory(int from,int to){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("from", from);
        params.put("to",to);
        List<CarUser> list = carUserMapper.getCarUserListHistory(params);
        if(list!=null&&list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
