package com.project.bean;

public class TeacherSubjectClass {
	
	private int id;
	private String tname;
	private String cname;
	private String sname;
	
	public TeacherSubjectClass(String tname, String cname, String sname) {
		super();
		this.tname = tname;
		this.cname = cname;
		this.sname = sname;
	}

	public TeacherSubjectClass() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "TeacherSubjectClass [id=" + id + ", tname=" + tname + ", cname=" + cname + ", sname=" + sname + "]";
	}
	
	

}
