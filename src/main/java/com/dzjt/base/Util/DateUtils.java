package com.dzjt.base.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	/**
	 * 返回昨天的时间 
	 * @return
	 */
	public static Date getLastDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-86400000);
		return cal.getTime();
	}
	/**
	 * 返回昨天String 类型
	 * @return
	 */
	public static String getLastDates() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-86400000);
		return sdf.format(cal.getTime());
		
		
	}
	/**
	 * 返回昨天String 类型
	 * @return
	 */
	public static String getLastDate1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-86400000);
		return sdf.format(cal.getTime());
	}
	
	/**
	 * 获取当前日期时间
	 */
	public static String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis()-86400000);
		return sdf.format(cal.getTime());
	}
	/**
	 * 获取时间差
	 * @param d2
	 * @param d1
	 * @return
	 */
	public static String getTimeDifference(Date startDate, Date endDate) {
	      long diff = endDate.getTime() - startDate.getTime();//这样得到的差值是微秒级别  
	      long days = diff / (1000 * 60 * 60 * 24);  
	      long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);  
	      long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
	      long seconds = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60)-minutes*(1000*60))/1000;
	      String result = days+"天"+hours+"小时"+minutes+"分"+seconds+"秒";
	      return result;
	}

}
