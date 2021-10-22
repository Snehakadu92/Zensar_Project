package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	private int cid;
	private String cname;
	private String personname;
	private String city;
	private String fees;
	public Course(int cid, String cname, String personname, String city, String fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.personname = personname;
		this.city = city;
		this.fees = fees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setPid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setPname(String personname) {
		this.personname = personname;
	}
	public String getCity() {
		return city;
	}
	public void getFes(String fees) {
		this.fees = fees;

	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", pname=" + personname+ ", city=" + city + ", fees=" + fees+"]";
	}

	
}
