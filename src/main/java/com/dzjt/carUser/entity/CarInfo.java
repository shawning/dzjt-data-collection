package com.dzjt.carUser.entity;

import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class CarInfo  implements Serializable {

	/**车辆ID**/
	private Integer id;

	/**公司ID**/
	private Integer companyId;

	/**公司名称**/
	private String companyName;

	/**车型ID**/
	private Integer carTypeId;

	/**车型**/
	private String carType;

	/**车牌号**/
	private String carNumer;

	/**0逻辑删除，1有效**/
	private Integer delFlag;

	/**创建人**/
	private String creater;

	/**创建时间**/
	private java.util.Date createTime;

	/**更新人**/
	private String updater;

	/**更新时间**/
	private java.util.Date updateTime;

	/**备用字段1**/
	private String bakstr1;



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setCompanyId(Integer companyId){
		this.companyId = companyId;
	}

	public Integer getCompanyId(){
		return this.companyId;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return this.companyName;
	}

	public void setCarTypeId(Integer carTypeId){
		this.carTypeId = carTypeId;
	}

	public Integer getCarTypeId(){
		return this.carTypeId;
	}

	public void setCarType(String carType){
		this.carType = carType;
	}

	public String getCarType(){
		return this.carType;
	}

	public void setCarNumer(String carNumer){
		this.carNumer = carNumer;
	}

	public String getCarNumer(){
		return this.carNumer;
	}

	public void setDelFlag(Integer delFlag){
		this.delFlag = delFlag;
	}

	public Integer getDelFlag(){
		return this.delFlag;
	}

	public void setCreater(String creater){
		this.creater = creater;
	}

	public String getCreater(){
		return this.creater;
	}

	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdater(String updater){
		this.updater = updater;
	}

	public String getUpdater(){
		return this.updater;
	}

	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	public void setBakstr1(String bakstr1){
		this.bakstr1 = bakstr1;
	}

	public String getBakstr1(){
		return this.bakstr1;
	}

}
