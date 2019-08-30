package com.woniu.mybatis.domian;

import java.io.Serializable;

public class BookImg implements Serializable {
	private int imgid ;
	private String imgPath ;
	private Book book ;
	private String isDefault ;//设置为封面  1 就是封面  默认 是 0
	
	public int getImgid() {
		return imgid;
	}
	public void setImgid(int imgid) {
		this.imgid = imgid;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	
}	
