package com.project.bean;

import javax.persistence.*;


public class Student {

	private int id;
	private String studentname;
	private String email;
	private String phone;
	private String classes;
	
	public Student(String studentname, String email, String phone, String classes) {
		super();
		this.studentname = studentname;
		this.email = email;
		this.phone = phone;
		this.classes = classes;
	}
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", email=" + email + ", phone=" + phone
				+ ", classes=" + classes + "]";
	}
	
	
	
	
	
}
