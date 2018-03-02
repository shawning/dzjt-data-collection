package com.dzjt.customer.mapper;


import com.dzjt.base.BaseMapper;
import com.dzjt.customer.entity.Customer;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 
 * CustomerMapper数据库操作接口类
 * 
 **/
@Repository
public interface CustomerMapper extends BaseMapper{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Customer selectByPrimaryKey(String phone);
	
	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	int  selectIsValidByPrimaryKey(String phone);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(String phone);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(Customer record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Customer record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Customer record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Customer record);
	
	/**
	 * 
	 * 用户信息修改（根据主键ID修改）
	 * 
	 **/
	int updateUserByPrimaryKey(Customer record);

	/**
	 * 获取历史所有的客户数据
	 * @param params
	 * @return
	 */
	List<Customer> getCustomerListHistory(Map<String, Object> params);

	/**
	 * 获取昨日新增的用户数据
	 * @param params
	 * @return
	 */
	Page<Customer> getCustomerListYesterday(Map<String, Object> params);

}