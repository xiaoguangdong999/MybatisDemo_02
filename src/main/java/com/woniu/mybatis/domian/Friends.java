package com.woniu.mybatis.domian;

public class Friends {
	private int fid ;
	private User user ;  //用户本身  
	private User friend ;//用户的好友   
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getFriend() {
		return friend;
	}
	public void setFriend(User friend) {
		this.friend = friend;
	}
	
	/*
	 * fid     userid       friendid
	 * 1        101          102 
	 * 2        101           103
	 * 3        101           108
	 * 4        105           108
	 * 5        106           108
	 * 
	 */
}
