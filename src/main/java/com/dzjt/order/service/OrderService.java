package com.dzjt.order.service;

import com.dzjt.base.Util.DateUtils;
import com.dzjt.order.entity.Order;
import com.dzjt.order.mapper.OrderMapper;
import com.github.pagehelper.Page;
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
public class OrderService {
	private static final Logger log = LoggerFactory.getLogger(OrderService.class);
	@Autowired
	private OrderMapper orderMapper;// 注入dao

	/**
	 * 获取昨天的订单数据
	 * @return
	 */
	public List getOrderListYesterday(){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("callDate", DateUtils.getLastDate1());
		List<Order> orderPage = orderMapper.getOrderListYesterday(params);
		if(orderPage!=null&&orderPage.size()>0){
			return orderPage;
		}else{
			return null;
		}
	}

	/**
	 * 分页查询数据
	 * @param from
	 * @param range
	 * @return
	 */
	public List getOrderListHistory(int from,int range){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("from", from);
		params.put("to",range);
		List<Order> orderPage = orderMapper.getOrderListHistory(params);
		if(orderPage!=null&&orderPage.size()>0){
			return orderPage;
		}else{
			return null;
		}
	}
}
