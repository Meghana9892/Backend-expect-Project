package com.project.bean;

public class Loginclass {

	private int loginid;
	private String username;
	private String password;
	
	public Loginclass(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Loginclass() {
		super();
	}

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Loginclass [loginid=" + loginid + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
