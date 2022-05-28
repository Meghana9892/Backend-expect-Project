package com.project.bean;

import java.util.Set;

public class Classes {
	
	private int classid;
	private String classname;
	Set<Subject> subjects;
	
	
	public Classes(String classname) {
		super();
		this.classname = classname;
	}
	
	public Classes() {
	
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Classes [classid=" + classid + ", classname=" + classname + ", subjects=" + subjects + "]";
	}
	
}
