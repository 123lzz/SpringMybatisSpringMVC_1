package com.hand.ssm.dto;

public class User {
	private String id;
	private String pwd;
	private String phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User() {

	}
	public User(String id, String pwd, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", phone=" + phone + "]";
	}
}
