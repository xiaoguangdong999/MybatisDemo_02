package com.woniu.mybatis.domian;

import java.util.Date;

public class Comment {


	private int commentid ;
	private String content ;
	private User user ;
	private Book book ;
	private Date createDate;
	private int dcount ; //µãÔÞÊý
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getDcount() {
		return dcount;
	}
	public void setDcount(int dcount) {
		this.dcount = dcount;
	}
}
