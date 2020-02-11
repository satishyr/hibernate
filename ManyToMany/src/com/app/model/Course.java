package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="cid")
	private int crid;
	@Column(name="cname")
	private String crname;
	@Column(name="ccost")
	private double crcost;
	public Course() {
		super();
	}
	public int getCrid() {
		return crid;
	}
	public void setCrid(int crid) {
		this.crid = crid;
	}
	public String getCrname() {
		return crname;
	}
	public void setCrname(String crname) {
		this.crname = crname;
	}
	public double getCrcost() {
		return crcost;
	}
	public void setCrcost(double crcost) {
		this.crcost = crcost;
	}
	@Override
	public String toString() {
		return "Course [crid=" + crid + ", crname=" + crname + ", crcost=" + crcost + "]";
	}
	

}
