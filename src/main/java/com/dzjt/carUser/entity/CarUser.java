package com.dzjt.carUser.entity;

import java.io.Serializable;

/**
 * 
 * 车主基本信息
 * 
 **/
@SuppressWarnings("serial")
public class CarUser implements Serializable {
	private Integer id;
	/** 手机号码 **/
	private String phone;

	/** 密码 **/
	private String password;

	/** 类型（0大众自营，1加盟，2其他车主） **/
	private Integer type;

	/** 头像信息 **/
	private String headPic;

	/** 名称 **/
	private String name;

	/** 称呼 **/
	private String nickName;

	/** 城市 **/
	private Integer city;

	/** 账户等级 **/
	private Integer level;

	/** 综合评价等级 **/
	private Integer grade;

	/** 账户累计总额 **/
	private Double total;

	/** 账户可用余额 **/
	private Double balance;

	/** 账户累积积分 **/
	private Double pointsSum;

	/** 账户可用积分 **/
	private Double pointsAvailable;

	/** 账户可用众币 **/
	private Double virtualCurrency;

	/** 状态0无效，1正常，2锁定，3拉黑 **/
	private Integer status;

	/** 车型 **/
	private Integer carType;

	/** 车牌号码 **/
	private String carNumber;

	/** 身份证号 **/
	private String idNumber;
	/** 关联主账号 **/
	private String mainUser;

	/** 订单总数 **/
	private Integer orderCount;

	/** 当日订单总数 **/
	private Integer orderCountToday;

	/** 是否认证（0未认证，1已认证） **/
	private Integer isValid;

	/** 注册时间 **/
	private java.util.Date registerDate;

	/** 上次活动时间 **/
	private java.util.Date lastLoginDate;

	/** 更新时间 **/
	private java.util.Date updateDate;

	/** 更新人 **/
	private Integer updateBy;

	/** 0逻辑删除，1有效 **/
	private Integer delFlag;

	/** 行驶证证号 **/
	private String xhLicenseNumber;
	/** 驾驶证号 **/
	private String jsLicenseNumber;

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

	private Integer isLogin;// 是否登录

	private String privatePhone;
	private String address;
	
	public String getPrivatePhone() {
		return privatePhone;
	}

	public void setPrivatePhone(String privatePhone) {
		this.privatePhone = privatePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(Integer isLogin) {
		this.isLogin = isLogin;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getXhLicenseNumber() {
		return xhLicenseNumber;
	}

	public void setXhLicenseNumber(String xhLicenseNumber) {
		this.xhLicenseNumber = xhLicenseNumber;
	}

	public String getJsLicenseNumber() {
		return jsLicenseNumber;
	}

	public void setJsLicenseNumber(String jsLicenseNumber) {
		this.jsLicenseNumber = jsLicenseNumber;
	}

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

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return this.type;
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

	public void setVirtualCurrency(Double virtualCurrency) {
		this.virtualCurrency = virtualCurrency;
	}

	public Double getVirtualCurrency() {
		return this.virtualCurrency;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public Integer getCarType() {
		return this.carType;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarNumber() {
		return this.carNumber;
	}

	public String getMainUser() {
		return mainUser;
	}

	public void setMainUser(String mainUser) {
		this.mainUser = mainUser;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getOrderCount() {
		return this.orderCount;
	}

	public void setOrderCountToday(Integer orderCountToday) {
		this.orderCountToday = orderCountToday;
	}

	public Integer getOrderCountToday() {
		return this.orderCountToday;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Integer getIsValid() {
		return this.isValid;
	}

	public void setRegisterDate(java.util.Date registerDate) {
		this.registerDate = registerDate;
	}

	public java.util.Date getRegisterDate() {
		return this.registerDate;
	}

	public void setLastLoginDate(java.util.Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public java.util.Date getLastLoginDate() {
		return this.lastLoginDate;
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

	@Override
	public String toString() {
		return "CarUser [id=" + id + ", phone=" + phone + ", password="
				+ password + ", type=" + type + ", headPic=" + headPic
				+ ", name=" + name + ", nickName=" + nickName + ", city="
				+ city + ", level=" + level + ", grade=" + grade + ", total="
				+ total + ", balance=" + balance + ", pointsSum=" + pointsSum
				+ ", pointsAvailable=" + pointsAvailable + ", virtualCurrency="
				+ virtualCurrency + ", status=" + status + ", carType="
				+ carType + ", carNumber=" + carNumber + ", idNumber="
				+ idNumber + ", mainUser=" + mainUser + ", orderCount="
				+ orderCount + ", orderCountToday=" + orderCountToday
				+ ", isValid=" + isValid + ", registerDate=" + registerDate
				+ ", lastLoginDate=" + lastLoginDate + ", updateDate="
				+ updateDate + ", updateBy=" + updateBy + ", delFlag="
				+ delFlag + ", xhLicenseNumber=" + xhLicenseNumber
				+ ", jsLicenseNumber=" + jsLicenseNumber + ", bakstr1="
				+ bakstr1 + ", bakstr2=" + bakstr2 + ", bakstr3=" + bakstr3
				+ ", bakstr4=" + bakstr4 + ", bakstr5=" + bakstr5
				+ ", isLogin=" + isLogin + ", privatePhone=" + privatePhone
				+ ", address=" + address + "]";
	}

}
