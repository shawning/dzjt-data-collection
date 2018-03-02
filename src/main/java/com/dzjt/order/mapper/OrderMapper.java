package com.dzjt.order.mapper;

import com.dzjt.base.BaseMapper;
import com.dzjt.customer.entity.Customer;
import com.dzjt.order.entity.Order;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * 
 * OrderMapper数据库操作接口类
 * 
 **/
@Repository
public interface OrderMapper extends BaseMapper{
	List<Order> getOrderListYesterday(Map<String, Object> params);
	List<Order> getOrderListHistory(Map<String,Object> params);
}