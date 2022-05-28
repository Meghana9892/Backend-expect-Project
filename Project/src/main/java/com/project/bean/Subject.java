package com.project.bean;

public class Subject {
	
	private int sub_id;
	private String sub_name;
	Classes classes;
	
	
	public Subject(String sub_name) {
		super();
		this.sub_name = sub_name;
	}
	
	public Subject() {
		
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", sub_name=" + sub_name + ", classes=" + classes + "]";
	}
	
}
