package com.fj.model;

public class User {
	private int user_id;
	private String user_name;
	private String user_password;
	private int user_phone;
	private String user_addres;
	private int isstudent;
	private int isteacher;
	private int isadmin;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_addres() {
		return user_addres;
	}
	public void setUser_addres(String user_addres) {
		this.user_addres = user_addres;
	}
	public int getIsstudent() {
		return isstudent;
	}
	public void setIsstudent(int isstudent) {
		this.isstudent = isstudent;
	}
	public int getIsteacher() {
		return isteacher;
	}
	public void setIsteacher(int isteacher) {
		this.isteacher = isteacher;
	}
	public int getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_phone=" + user_phone + ", user_addres=" + user_addres + ", isstudent=" + isstudent
				+ ", isteacher=" + isteacher + ", isadmin=" + isadmin + "]";
	}

}
