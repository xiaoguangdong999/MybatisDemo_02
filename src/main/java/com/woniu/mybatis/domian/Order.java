package com.woniu.mybatis.domian;

import java.util.Date;
import java.util.Set;

public class Order {
	private int orderid ;
	private String oredrNum ;
	private Date createDate ;
	private User user ;
	private Set<OrderItem> items ;
	private Address address ;
	private String status ;
	private double allPrice ;
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOredrNum() {
		return oredrNum;
	}
	public void setOredrNum(String oredrNum) {
		this.oredrNum = oredrNum;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<OrderItem> getItems() {
		return items;
	}
	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAllPrice() {
		return allPrice;
	}
	public void setAllPrice(double allPrice) {
		this.allPrice = allPrice;
	}
}
