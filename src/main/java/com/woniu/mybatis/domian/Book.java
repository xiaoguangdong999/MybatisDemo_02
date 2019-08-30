package com.woniu.mybatis.domian;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	private int bookid ;
	private String bookName ;
	private String publish ;
	private String author ;
	private Date publishDate ;
	private double price ;
	private double nowPrice ;
	private String status ; //状态 1 上架   0  下架 
	private String decription ;
	private String bookNum ; //编号
	private BookType booktype ;  // 1 ,推荐  2 特价  3 精选   0  普通
	private  Category category ;
	private String bookImg ;  //封面
	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(double nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public BookType getBooktype() {
		return booktype;
	}
	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", publish=" + publish + ", author=" + author
				+ ", publishDate=" + publishDate + ", price=" + price + ", nowPrice=" + nowPrice + ", status=" + status
				+ ", decription=" + decription + ", bookNum=" + bookNum + ", booktype=" + booktype + ", category="
				+ category + ", bookImg=" + bookImg + "]";
	}
	
}
