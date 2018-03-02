package com.dzjt.order.entity;

import java.io.Serializable;


/**
 * 
 * 搬场订单表
 * 
 **/
@SuppressWarnings("serial")
public class MovefieldOrder   implements Serializable {

	/**订单ID**/
	private String orderId;

	/**订单来源(0 为业务员pad  1为callcenter)**/
	private Integer orderSource;

	/**订单类型**/
	private Integer orderType;

	/**车辆类型(0 小车  1 大车)**/
	private Integer carType;

	/**用车数量**/
	private String carNum;

	/**接单公司ID**/
	private Integer ordertakingId;

	/**接单公司名称**/
	private String ordertakingName;

	/**客户电话号码**/
	private String customerPhone;

	/**客户联系人姓名**/
	private String customerName;

	/**客户单位(托运单位)**/
	private String consignmentUnit;

	/**预约时间**/
	private java.util.Date bookDate;

	/**预估时间档占用**/
	private String expectedTimeFile;

	/**时间档占用**/
	private String timeFile;

	/**独立人工费**/
	private Double independentManpowerPrice;

	/**独立人工数**/
	private String independentManpowerNum;

	/**独立人工时长**/
	private Integer independentManpowerTime;

	/**车次**/
	private Integer transportTimes;

	/**订单数**/
	private Integer orderTimes;

	/**备注**/
	private String descripetion;

	/**状态(0下单未创建 1草稿单未分配  2 下单已分配 3需人工分配 4取消 5待支付 6运输完成 7订单完成)**/
	private Integer status;

	/**订单开始时间**/
	private java.util.Date orderStartDate;

	/**运输开始时间**/
	private java.util.Date tranportStartDate;

	/**运输结束时间**/
	private java.util.Date tranportEndDate;

	/**订单完成时间**/
	private java.util.Date finishDate;

	/**回拨电话**/
	private String callbackPhone;

	/**预计公里数**/
	private String expectedKm;

	/**起运距离费**/
	private Double startEndDistancePrice;

	/**预期总金额**/
	private Double expectedTotalPrice;

	/**回单总金额**/
	private Double receiptPrice;

	/**回款总金额**/
	private Double backPrice;

	/**开票总金额**/
	private Double invoicePrice;
	
	/**拆装费总价**/
	private Double breakPackageSumPrice;
	
	/**拆装费调价**/
	private Double breakPackageTransferPrice;
	
	/**搬运费总价**/
	private Double moveSumPrice;
	
	/**搬运费调价**/
	private Double moveTransfeRprice;
	
	/**搬运费费用**/
	private Double holidaysPrice;
	
	/**打包费调价**/
	private Double packSumPrice;
	
	/**打包费用**/
	private Double packTransfePrice;
	
	/**特殊费**/
	private Double specialPrice;
	
	/**辅料费**/
	private Double accessoriesPrice;
	
	
	/**开票类型**/
	private Integer invoiceType;

	/**纳税人识别号**/
	private String taxpayerIdentityNumber;

	/**开票公司**/
	private String invoiceCompany;

	/**地址电话**/
	private String addressPhone;

	/**寄票地址**/
	private String invoiceAddress;

	/**开户行及账号**/
	private String bankBanknumber;

	/**其它费用**/
	private Double otherPrice;

	/**其它费用描述**/
	private String otherPriceDescription;

	/**其它费用2**/
	private Double otherPrice2;

	/**其它费用描述2**/
	private String otherPriceDescription2;

	/**其它费用3**/
	private Double otherPrice3;

	/**其它费用描述3**/
	private String otherPriceDescription3;

	/**其它费用3**/
	private Double otherPrice4;

	/**其它费用描述3**/
	private String otherPriceDescription4;

	/**是否为本部订单(0 为本部 1不为)**/
	private Integer isLocal;

	/**任务类型(0 为质检 1 为勘探)**/
	private Integer taskType;

	/**0逻辑删除，1有效**/
	private Integer delFlag;

	/**是否开票:0 未开票  ; 1 已开票**/
	private Integer isInvoice;

	/**对象描述**/
	private String objectdexcription;

	/**创建人**/
	private String creater;

	/**创建时间**/
	private java.util.Date createTime;

	/**更新人**/
	private String updater;

	/**更新时间**/
	private java.util.Date updateTime;

	/**订单来源号**/
	private String bakstr1;

	/**其他联系人**/
	private String bakstr2;

	/**其他联系人电话**/
	private String bakstr3;

	/**备用字段4**/
	private String bakstr4;

	/**备用字段5**/
	private String bakstr5;

	/**备用字段6**/
	private String bakstr6;

	/**备用字段7**/
	private String bakstr7;

	/**备用字段8**/
	private String bakstr8;

	/**备用字段9**/
	private String bakstr9;
	
	/*车辆基价*/
	private Integer carTypePrice;
	
	/**意向单号**/
	private String parentId;
	
	/**是否可被分配**/
	private Integer isAssigned;
	
	private String id;
	private String _parentId;
	private String state;
	private String startPlace;
	private String endPlace;
	private String carNumber;
	/*private MovefieldOrderPlace startPlace;
	
	private List<MovefieldOrderPlace> endPlace;*/
	/**回访状态（0：未回访，1：已回访）**/
	private Integer visitState;

	/**客服处理状态（0：未处理，1：已处理）**/
	private Integer workState;
	/**优惠券ID**/
	private String couponsId;
	/**优惠券No**/
	private String couponsNo;
	/**金额**/
	private String couponsMoney;
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public Integer getOrdertakingId() {
		return ordertakingId;
	}

	public void setOrdertakingId(Integer ordertakingId) {
		this.ordertakingId = ordertakingId;
	}

	public String getOrdertakingName() {
		return ordertakingName;
	}

	public void setOrdertakingName(String ordertakingName) {
		this.ordertakingName = ordertakingName;
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

	public String getConsignmentUnit() {
		return consignmentUnit;
	}

	public void setConsignmentUnit(String consignmentUnit) {
		this.consignmentUnit = consignmentUnit;
	}

	public java.util.Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(java.util.Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getExpectedTimeFile() {
		return expectedTimeFile;
	}

	public void setExpectedTimeFile(String expectedTimeFile) {
		this.expectedTimeFile = expectedTimeFile;
	}

	public String getTimeFile() {
		return timeFile;
	}

	public void setTimeFile(String timeFile) {
		this.timeFile = timeFile;
	}

	public Double getIndependentManpowerPrice() {
		return independentManpowerPrice;
	}

	public void setIndependentManpowerPrice(Double independentManpowerPrice) {
		this.independentManpowerPrice = independentManpowerPrice;
	}

	public String getIndependentManpowerNum() {
		return independentManpowerNum;
	}

	public void setIndependentManpowerNum(String independentManpowerNum) {
		this.independentManpowerNum = independentManpowerNum;
	}

	public Integer getIndependentManpowerTime() {
		return independentManpowerTime;
	}

	public void setIndependentManpowerTime(Integer independentManpowerTime) {
		this.independentManpowerTime = independentManpowerTime;
	}

	public Integer getTransportTimes() {
		return transportTimes;
	}

	public void setTransportTimes(Integer transportTimes) {
		this.transportTimes = transportTimes;
	}

	public Integer getOrderTimes() {
		return orderTimes;
	}

	public void setOrderTimes(Integer orderTimes) {
		this.orderTimes = orderTimes;
	}

	public String getDescripetion() {
		return descripetion;
	}

	public void setDescripetion(String descripetion) {
		this.descripetion = descripetion;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getOrderStartDate() {
		return orderStartDate;
	}

	public void setOrderStartDate(java.util.Date orderStartDate) {
		this.orderStartDate = orderStartDate;
	}

	public java.util.Date getTranportStartDate() {
		return tranportStartDate;
	}

	public void setTranportStartDate(java.util.Date tranportStartDate) {
		this.tranportStartDate = tranportStartDate;
	}

	public java.util.Date getTranportEndDate() {
		return tranportEndDate;
	}

	public void setTranportEndDate(java.util.Date tranportEndDate) {
		this.tranportEndDate = tranportEndDate;
	}

	public java.util.Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(java.util.Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getCallbackPhone() {
		return callbackPhone;
	}

	public void setCallbackPhone(String callbackPhone) {
		this.callbackPhone = callbackPhone;
	}

	public String getExpectedKm() {
		return expectedKm;
	}

	public void setExpectedKm(String expectedKm) {
		this.expectedKm = expectedKm;
	}

	public Double getStartEndDistancePrice() {
		return startEndDistancePrice;
	}

	public void setStartEndDistancePrice(Double startEndDistancePrice) {
		this.startEndDistancePrice = startEndDistancePrice;
	}

	public Double getExpectedTotalPrice() {
		return expectedTotalPrice;
	}

	public void setExpectedTotalPrice(Double expectedTotalPrice) {
		this.expectedTotalPrice = expectedTotalPrice;
	}

	public Double getReceiptPrice() {
		return receiptPrice;
	}

	public void setReceiptPrice(Double receiptPrice) {
		this.receiptPrice = receiptPrice;
	}

	public Double getBackPrice() {
		return backPrice;
	}

	public void setBackPrice(Double backPrice) {
		this.backPrice = backPrice;
	}

	public Double getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(Double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public Double getHolidaysPrice() {
		return holidaysPrice;
	}

	public void setHolidaysPrice(Double holidaysPrice) {
		this.holidaysPrice = holidaysPrice;
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getTaxpayerIdentityNumber() {
		return taxpayerIdentityNumber;
	}

	public void setTaxpayerIdentityNumber(String taxpayerIdentityNumber) {
		this.taxpayerIdentityNumber = taxpayerIdentityNumber;
	}

	public String getInvoiceCompany() {
		return invoiceCompany;
	}

	public void setInvoiceCompany(String invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}

	public String getAddressPhone() {
		return addressPhone;
	}

	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
	}

	public String getInvoiceAddress() {
		return invoiceAddress;
	}

	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}

	public String getBankBanknumber() {
		return bankBanknumber;
	}

	public void setBankBanknumber(String bankBanknumber) {
		this.bankBanknumber = bankBanknumber;
	}

	public Double getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(Double otherPrice) {
		this.otherPrice = otherPrice;
	}

	public String getOtherPriceDescription() {
		return otherPriceDescription;
	}

	public void setOtherPriceDescription(String otherPriceDescription) {
		this.otherPriceDescription = otherPriceDescription;
	}

	public Double getOtherPrice2() {
		return otherPrice2;
	}

	public void setOtherPrice2(Double otherPrice2) {
		this.otherPrice2 = otherPrice2;
	}

	public String getOtherPriceDescription2() {
		return otherPriceDescription2;
	}

	public void setOtherPriceDescription2(String otherPriceDescription2) {
		this.otherPriceDescription2 = otherPriceDescription2;
	}

	public Double getOtherPrice3() {
		return otherPrice3;
	}

	public void setOtherPrice3(Double otherPrice3) {
		this.otherPrice3 = otherPrice3;
	}

	public String getOtherPriceDescription3() {
		return otherPriceDescription3;
	}

	public void setOtherPriceDescription3(String otherPriceDescription3) {
		this.otherPriceDescription3 = otherPriceDescription3;
	}

	public Double getOtherPrice4() {
		return otherPrice4;
	}

	public void setOtherPrice4(Double otherPrice4) {
		this.otherPrice4 = otherPrice4;
	}

	public String getOtherPriceDescription4() {
		return otherPriceDescription4;
	}

	public void setOtherPriceDescription4(String otherPriceDescription4) {
		this.otherPriceDescription4 = otherPriceDescription4;
	}

	public Integer getIsLocal() {
		return isLocal;
	}

	public void setIsLocal(Integer isLocal) {
		this.isLocal = isLocal;
	}

	public Integer getTaskType() {
		return taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Integer getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(Integer isInvoice) {
		this.isInvoice = isInvoice;
	}

	public String getObjectdexcription() {
		return objectdexcription;
	}

	public void setObjectdexcription(String objectdexcription) {
		this.objectdexcription = objectdexcription;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
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

	public String getBakstr6() {
		return bakstr6;
	}

	public void setBakstr6(String bakstr6) {
		this.bakstr6 = bakstr6;
	}

	public String getBakstr7() {
		return bakstr7;
	}

	public void setBakstr7(String bakstr7) {
		this.bakstr7 = bakstr7;
	}

	public String getBakstr8() {
		return bakstr8;
	}

	public void setBakstr8(String bakstr8) {
		this.bakstr8 = bakstr8;
	}

	public String getBakstr9() {
		return bakstr9;
	}

	public void setBakstr9(String bakstr9) {
		this.bakstr9 = bakstr9;
	}

	
	/*public MovefieldOrderPlace getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(MovefieldOrderPlace startPlace) {
		this.startPlace = startPlace;
	}

	public List<MovefieldOrderPlace> getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(List<MovefieldOrderPlace> endPlace) {
		this.endPlace = endPlace;
	}*/

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public Double getBreakPackageSumPrice() {
		return breakPackageSumPrice;
	}

	public void setBreakPackageSumPrice(Double breakPackageSumPrice) {
		this.breakPackageSumPrice = breakPackageSumPrice;
	}

	public Double getBreakPackageTransferPrice() {
		return breakPackageTransferPrice;
	}

	public void setBreakPackageTransferPrice(Double breakPackageTransferPrice) {
		this.breakPackageTransferPrice = breakPackageTransferPrice;
	}

	public Double getMoveSumPrice() {
		return moveSumPrice;
	}

	public void setMoveSumPrice(Double moveSumPrice) {
		this.moveSumPrice = moveSumPrice;
	}

	public Double getMoveTransfeRprice() {
		return moveTransfeRprice;
	}

	public void setMoveTransfeRprice(Double moveTransfeRprice) {
		this.moveTransfeRprice = moveTransfeRprice;
	}

	public Double getPackSumPrice() {
		return packSumPrice;
	}

	public void setPackSumPrice(Double packSumPrice) {
		this.packSumPrice = packSumPrice;
	}

	public Double getPackTransfePrice() {
		return packTransfePrice;
	}

	public void setPackTransfePrice(Double packTransfePrice) {
		this.packTransfePrice = packTransfePrice;
	}

	public Integer getCarTypePrice() {
		return carTypePrice;
	}
	public Double getSpecialPrice() {
		return specialPrice;
	}

	public void setCarTypePrice(Integer carTypePrice) {
		this.carTypePrice = carTypePrice;
	}


	public void setSpecialPrice(Double specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Double getAccessoriesPrice() {
		return accessoriesPrice;
	}

	public void setAccessoriesPrice(Double accessoriesPrice) {
		this.accessoriesPrice = accessoriesPrice;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getIsAssigned() {
		return isAssigned;
	}

	public void setIsAssigned(Integer isAssigned) {
		this.isAssigned = isAssigned;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String get_parentId() {
		return _parentId;
	}

	public void set_parentId(String _parentId) {
		this._parentId = _parentId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Integer getVisitState() {
		return visitState;
	}

	public void setVisitState(Integer visitState) {
		this.visitState = visitState;
	}

	public Integer getWorkState() {
		return workState;
	}

	public void setWorkState(Integer workState) {
		this.workState = workState;
	}

	public String getCouponsId() {
		return couponsId;
	}

	public void setCouponsId(String couponsId) {
		this.couponsId = couponsId;
	}

	public String getCouponsNo() {
		return couponsNo;
	}

	public void setCouponsNo(String couponsNo) {
		this.couponsNo = couponsNo;
	}

	public String getCouponsMoney() {
		return couponsMoney;
	}

	public void setCouponsMoney(String couponsMoney) {
		this.couponsMoney = couponsMoney;
	}

	
	
}
