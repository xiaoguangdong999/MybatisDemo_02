package com.woniu.mybatis.pojo;

import java.util.Date;
import java.util.List;

//封装查询条件对象
public class QueryVo {
	private String username ;
	private String sex ;
	private int minAge ;
	private int maxAge ;
	private int startIdex ;
	private int pageSize ;
	private Date minDate ;
	private Date maxDate ;
	private String address ;
	
	private List<Integer> ids ;
	
	//private GoodsType goodsType ;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public int getStartIdex() {
		return startIdex;
	}

	public void setStartIdex(int startIdex) {
		this.startIdex = startIdex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	
}
