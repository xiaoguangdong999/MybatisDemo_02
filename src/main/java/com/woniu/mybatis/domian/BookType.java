package com.woniu.mybatis.domian;

import java.io.Serializable;

public class BookType  implements Serializable {
	private int  typeid ;
	private String typeName ;
	private String decription ;
	
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	@Override
	public String toString() {
		return "BookType [typeid=" + typeid + ", typeName=" + typeName + ", decription=" + decription + "]";
	}
}
