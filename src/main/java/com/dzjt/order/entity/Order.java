package com.dzjt.order.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 订单基本信息
 * 
 **/
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3849746866641070315L;
	
	
	private Integer orderSource;

	private Date orderStartDate;

	/** 订单号 **/
	private String orderId;

	/** 订单类型(0：app叫车，1：callcenter，2：app预约，3：callcenter预约，) **/
	private Integer orderType;

	/** 车型 **/
	private String carType;

	/** 数量（默认1） **/
	private Integer carNumber;

	/** 起点 **/
	private String startPlace;

	/** 起点gps信息 **/
	private String startGps;

	/** 终点（存储json） **/
	private String endPlace;

	/** 终点gps信息（存储json） **/
	private String endGps;

	/** 预计公里数 km 小数后两位 **/
	private Float expectedKm;

	/** 实际公里数 km 小数后两位 **/
	private Float actualKm;

	/** 订单总价格 **/
	private Float totalPrice;

	/** 预计车费价格 小数后两位 **/
	private Float expectedPrice;

	/** 实际车费价格 小数后两位 **/
	private Float actualPrice;

	/** 其他费用1 **/
	private Float otherPrice;

	/** 费用名称1 **/
	private String otherPriceDescription;

	/** 其他费用2 **/
	private Float otherPrice2;

	/** 费用名称2 **/
	private String otherPriceDescription2;

	/** 其他费用3 **/
	private Float otherPrice3;

	/** 费用名称3 **/
	private String otherPriceDescription3;

	/** 其他费用4 **/
	private Float otherPrice4;

	/** 费用名称4 **/
	private String otherPriceDescription4;

	/** 货主手机号 **/
	private String customerPhone;

	/** 货主名称 **/
	private String customerName;
	/**车主ID**/
	private Integer carUserId;

	/** 手机号码 **/
	private String carUserPhone;

	/** 车主名称 **/
	private String carUserName;

	/** 叫车时间 **/
	private Date callDate;

	/** 预约时间 **/
	private Date bookDate;

	/** 运输开始时间 **/
	private Date tranportStartDate;

	/** 运输结束时间 **/
	private Date tranportEndDate;

	/** 订单完成时间 **/
	private Date finishDate;

	/** 货主获评 **/
	private Integer customerGrade;

	/** 车主获评 **/
	private Integer carUserGrade;

	/** 众币奖励或消耗(+100/-100) **/
	private Float virtual;

	/** 结算类型(0,大众内部，1加盟的，2其他) **/
	private Integer settlementType;

	/** 回拨电话 **/
	private String callbackPhone;

	/** 后台接线员id **/
	private Integer creater;

	/** 状态0创建，1已接单，2已完成，3取消，4放空 **/
	private Integer status;

	/** 更新时间 **/
	private Date updateDate;

	/** 更新人 **/
	private Integer updateBy;

	/** 0逻辑删除，1有效 **/
	private Integer delFlag;

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

	/** 头像信息 **/
	private String headPic;

	/** 名称 **/
	private String name;

	/** 称呼 **/
	private String nickName;

	/** 车牌号码 **/
	private String carNumbers;

	/** 0卡券，1支付宝，2现金，3微信，4货主储值账户，5车主押金账户 **/
	private Integer type;

	/** 金额 **/
	private Float money;

	private Integer isInvoice;

	private Double lowSpeedTimes;
	public Integer getCarUserId() {
		return carUserId;
	}

	public void setCarUserId(Integer carUserId) {
		this.carUserId = carUserId;
	}
	public Date getOrderStartDate() {
		return orderStartDate;
	}

	public void setOrderStartDate(Date orderStartDate) {
		this.orderStartDate = orderStartDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Integer getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(Integer carNumber) {
		this.carNumber = carNumber;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getStartGps() {
		return startGps;
	}

	public void setStartGps(String startGps) {
		this.startGps = startGps;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public String getEndGps() {
		return endGps;
	}

	public void setEndGps(String endGps) {
		this.endGps = endGps;
	}

	public Float getExpectedKm() {
		return expectedKm;
	}

	public void setExpectedKm(Float expectedKm) {
		this.expectedKm = expectedKm;
	}

	public Float getActualKm() {
		return actualKm;
	}

	public void setActualKm(Float actualKm) {
		this.actualKm = actualKm;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Float getExpectedPrice() {
		return expectedPrice;
	}

	public void setExpectedPrice(Float expectedPrice) {
		this.expectedPrice = expectedPrice;
	}

	public Float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Float getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(Float otherPrice) {
		this.otherPrice = otherPrice;
	}

	public String getOtherPriceDescription() {
		return otherPriceDescription;
	}

	public void setOtherPriceDescription(String otherPriceDescription) {
		this.otherPriceDescription = otherPriceDescription;
	}

	public Float getOtherPrice2() {
		return otherPrice2;
	}

	public void setOtherPrice2(Float otherPrice2) {
		this.otherPrice2 = otherPrice2;
	}

	public String getOtherPriceDescription2() {
		return otherPriceDescription2;
	}

	public void setOtherPriceDescription2(String otherPriceDescription2) {
		this.otherPriceDescription2 = otherPriceDescription2;
	}

	public Float getOtherPrice3() {
		return otherPrice3;
	}

	public void setOtherPrice3(Float otherPrice3) {
		this.otherPrice3 = otherPrice3;
	}

	public String getOtherPriceDescription3() {
		return otherPriceDescription3;
	}

	public void setOtherPriceDescription3(String otherPriceDescription3) {
		this.otherPriceDescription3 = otherPriceDescription3;
	}

	public Float getOtherPrice4() {
		return otherPrice4;
	}

	public void setOtherPrice4(Float otherPrice4) {
		this.otherPrice4 = otherPrice4;
	}

	public String getOtherPriceDescription4() {
		return otherPriceDescription4;
	}

	public void setOtherPriceDescription4(String otherPriceDescription4) {
		this.otherPriceDescription4 = otherPriceDescription4;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCarUserPhone() {
		return carUserPhone;
	}

	public void setCarUserPhone(String carUserPhone) {
		this.carUserPhone = carUserPhone;
	}

	public String getCarUserName() {
		return carUserName;
	}

	public void setCarUserName(String carUserName) {
		this.carUserName = carUserName;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Date getTranportStartDate() {
		return tranportStartDate;
	}

	public void setTranportStartDate(Date tranportStartDate) {
		this.tranportStartDate = tranportStartDate;
	}

	public Date getTranportEndDate() {
		return tranportEndDate;
	}

	public void setTranportEndDate(Date tranportEndDate) {
		this.tranportEndDate = tranportEndDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Integer getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(Integer customerGrade) {
		this.customerGrade = customerGrade;
	}

	public Integer getCarUserGrade() {
		return carUserGrade;
	}

	public void setCarUserGrade(Integer carUserGrade) {
		this.carUserGrade = carUserGrade;
	}

	public Float getVirtual() {
		return virtual;
	}

	public void setVirtual(Float virtual) {
		this.virtual = virtual;
	}

	public Integer getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Integer settlementType) {
		this.settlementType = settlementType;
	}

	public String getCallbackPhone() {
		return callbackPhone;
	}

	public void setCallbackPhone(String callbackPhone) {
		this.callbackPhone = callbackPhone;
	}

	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getBakstr1() {
		return bakstr1;
	}

	public void setBakstr1(String bakstr1) {
		this.bakstr1 = bakstr1;
	}

	public String getBakstr2() {
		return bakstr2;
	}

	public void setBakstr2(String bakstr2) {
		this.bakstr2 = bakstr2;
	}

	public String getBakstr3() {
		return bakstr3;
	}

	public void setBakstr3(String bakstr3) {
		this.bakstr3 = bakstr3;
	}

	public String getBakstr4() {
		return bakstr4;
	}

	public void setBakstr4(String bakstr4) {
		this.bakstr4 = bakstr4;
	}

	public String getBakstr5() {
		return bakstr5;
	}

	public void setBakstr5(String bakstr5) {
		this.bakstr5 = bakstr5;
	}

	public String getHeadPic() {
		return headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCarNumbers() {
		return carNumbers;
	}

	public void setCarNumbers(String carNumbers) {
		this.carNumbers = carNumbers;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Integer getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(Integer isInvoice) {
		this.isInvoice = isInvoice;
	}

	public Double getLowSpeedTimes() {
		return lowSpeedTimes;
	}

	public void setLowSpeedTimes(Double lowSpeedTimes) {
		this.lowSpeedTimes = lowSpeedTimes;
	}

	public Integer getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}

	@Override
	public String toString() {
		return "Order [orderSource=" + orderSource + ", orderStartDate="
				+ orderStartDate + ", orderId=" + orderId + ", orderType="
				+ orderType + ", carType=" + carType + ", carNumber="
				+ carNumber + ", startPlace=" + startPlace + ", startGps="
				+ startGps + ", endPlace=" + endPlace + ", endGps=" + endGps
				+ ", expectedKm=" + expectedKm + ", actualKm=" + actualKm
				+ ", totalPrice=" + totalPrice + ", expectedPrice="
				+ expectedPrice + ", actualPrice=" + actualPrice
				+ ", otherPrice=" + otherPrice + ", otherPriceDescription="
				+ otherPriceDescription + ", otherPrice2=" + otherPrice2
				+ ", otherPriceDescription2=" + otherPriceDescription2
				+ ", otherPrice3=" + otherPrice3 + ", otherPriceDescription3="
				+ otherPriceDescription3 + ", otherPrice4=" + otherPrice4
				+ ", otherPriceDescription4=" + otherPriceDescription4
				+ ", customerPhone=" + customerPhone + ", customerName="
				+ customerName + ", carUserId=" + carUserId + ", carUserPhone="
				+ carUserPhone + ", carUserName=" + carUserName + ", callDate="
				+ callDate + ", bookDate=" + bookDate + ", tranportStartDate="
				+ tranportStartDate + ", tranportEndDate=" + tranportEndDate
				+ ", finishDate=" + finishDate + ", customerGrade="
				+ customerGrade + ", carUserGrade=" + carUserGrade
				+ ", virtual=" + virtual + ", settlementType=" + settlementType
				+ ", callbackPhone=" + callbackPhone + ", creater=" + creater
				+ ", status=" + status + ", updateDate=" + updateDate
				+ ", updateBy=" + updateBy + ", delFlag=" + delFlag
				+ ", bakstr1=" + bakstr1 + ", bakstr2=" + bakstr2
				+ ", bakstr3=" + bakstr3 + ", bakstr4=" + bakstr4
				+ ", bakstr5=" + bakstr5 + ", headPic=" + headPic + ", name="
				+ name + ", nickName=" + nickName + ", carNumbers="
				+ carNumbers + ", type=" + type + ", money=" + money
				+ ", isInvoice=" + isInvoice + ", lowSpeedTimes="
				+ lowSpeedTimes + "]";
	}

}
