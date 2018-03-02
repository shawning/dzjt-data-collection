package com.dzjt.carUser.mapper;

import com.dzjt.base.BaseMapper;
import com.dzjt.carUser.entity.CarUser;
import com.dzjt.order.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * 
 * OrderMapper数据库操作接口类
 * 
 **/
@Repository
public interface CarUserMapper extends BaseMapper{
	List<CarUser> getCarUserListYesterday(Map<String, Object> params);
	List<CarUser> getCarUserListHistory(Map<String, Object> params);
}