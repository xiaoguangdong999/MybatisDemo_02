package com.woniu.mybatis.domian;

import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable{
	private int cateid ;
	private String cateName ;
	private String decription ;
	
	
	//private Set<Book> books ;
	
	
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	@Override
	public String toString() {
		return "Category [cateid=" + cateid + ", cateName=" + cateName + ", decription=" + decription + "]";
	}
	
	/*public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}*/
	/*@Override
	public String toString() {
		return "Category [cateid=" + cateid + ", cateName=" + cateName + ", decription=" + decription + ", books="
				+ books + "]";
	}*/
}
