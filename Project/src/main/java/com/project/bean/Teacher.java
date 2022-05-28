package com.project.bean;



public class Teacher {

	private int t_id;
	private String t_name;
	private String t_email;
	private String t_phone;

	
	
	public Teacher(String t_name, String t_email, String t_phone) {
		super();
		this.t_name = t_name;
		this.t_email = t_email;
		this.t_phone = t_phone;
	}

	public Teacher() {
		super();
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_email() {
		return t_email;
	}

	public void setT_email(String t_email) {
		this.t_email = t_email;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + ", t_email=" + t_email + ", t_phone=" + t_phone + "]";
	}

	
	 	
	
	
	
}
