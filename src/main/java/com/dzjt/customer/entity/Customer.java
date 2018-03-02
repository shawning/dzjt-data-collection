package com.dzjt.customer.entity;

import java.io.Serializable;

/**
 * 
 * 货主基本信息
 * 
 **/
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8282013535570504806L;

	/** 手机号码 **/
	private String phone;

	/** 密码 **/
	private String password;

	/** 头像信息 **/
	private String headPic;

	/** 名称 **/
	private String name;

	/** 称呼 **/
	private String nickName;

	/** 城市 **/
	private Integer city;

	/** 等级 **/
	private Integer level;

	/** 评价等级 **/
	private Integer grade;

	/** 总额 **/
	private Double total;

	/** 可用余额 **/
	private Double balance;

	/** 总积分 **/
	private Double pointsSum;

	/** 可用积分 **/
	private Double pointsAvailable;

	/** 订单总数 **/
	private Integer orderCount;

	/** 放空次数 **/
	private Integer failedOrderCount;

	/** 注册时间 **/
	private java.util.Date createDate;

	/** 上次活动时间 **/
	private java.util.Date lastLoginDate;
	/** 状态0无效，1正常，2锁定，3拉黑 **/
	private Integer status;
	/** 是否认证（0非认证，1认证完成，2认证失败） **/
	private Integer isValid;
	/** 更新时间 **/
	private java.util.Date updateDate;
	/** 更新人 **/
	private Integer updateBy;
	/** 0逻辑删除，1有效 **/
	private Integer delFlag;
	/** 1已在微信端绑定，0未在微信端绑定 **/
	private Integer isWechat;
	/** 1已在APP端注册，0未在APP端注册 **/
	private Integer isApp;
	/** 1已在96811使用，0未在96811使用 **/
	private Integer isCallcenter;
	/** 微信openId **/
	private String Openid;
	/** 备用字段1 **/
	private String bakstr1;
	/** 备用字段2 **/
	private String bakstr2;
	/** 备用字段3 **/
	private String bakstr3;
	/** 备用字段4 **/
	private String bakstr4;
	/** 备用字段5 **/
	private String bakstr5;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	public String getHeadPic() {
		return this.headPic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getCity() {
		return this.city;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setPointsSum(Double pointsSum) {
		this.pointsSum = pointsSum;
	}

	public Double getPointsSum() {
		return this.pointsSum;
	}

	public void setPointsAvailable(Double pointsAvailable) {
		this.pointsAvailable = pointsAvailable;
	}

	public Double getPointsAvailable() {
		return this.pointsAvailable;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getOrderCount() {
		return this.orderCount;
	}

	public void setFailedOrderCount(Integer failedOrderCount) {
		this.failedOrderCount = failedOrderCount;
	}

	public Integer getFailedOrderCount() {
		return this.failedOrderCount;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public java.util.Date getCreateDate() {
		return this.createDate;
	}

	public void setLastLoginDate(java.util.Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public java.util.Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Integer getIsValid() {
		return this.isValid;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Integer getUpdateBy() {
		return this.updateBy;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Integer getDelFlag() {
		return this.delFlag;
	}

	public void setBakstr1(String bakstr1) {
		this.bakstr1 = bakstr1;
	}

	public String getBakstr1() {
		return this.bakstr1;
	}

	public void setBakstr2(String bakstr2) {
		this.bakstr2 = bakstr2;
	}

	public String getBakstr2() {
		return this.bakstr2;
	}

	public void setBakstr3(String bakstr3) {
		this.bakstr3 = bakstr3;
	}

	public String getBakstr3() {
		return this.bakstr3;
	}

	public void setBakstr4(String bakstr4) {
		this.bakstr4 = bakstr4;
	}

	public String getBakstr4() {
		return this.bakstr4;
	}

	public void setBakstr5(String bakstr5) {
		this.bakstr5 = bakstr5;
	}

	public String getBakstr5() {
		return this.bakstr5;
	}

	public Integer getIsWechat() {
		return isWechat;
	}

	public void setIsWechat(Integer isWechat) {
		this.isWechat = isWechat;
	}

	public Integer getIsApp() {
		return isApp;
	}

	public void setIsApp(Integer isApp) {
		this.isApp = isApp;
	}

	public Integer getIsCallcenter() {
		return isCallcenter;
	}

	public void setIsCallcenter(Integer isCallcenter) {
		this.isCallcenter = isCallcenter;
	}

	public String getOpenid() {
		return Openid;
	}

	public void setOpenid(String openid) {
		Openid = openid;
	}

}
