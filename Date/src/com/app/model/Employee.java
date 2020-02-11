package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="emp2")
public class Employee {
	@Id
	@Column(name="eid")
private int eid;
	@Column(name="ename")
private String ename;
	@Temporal(TemporalType.DATE)
	@Column(name="date")
private Date dt1;
	@Temporal(TemporalType.TIME)
    @Column(name="time")
	private Date dt2;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="daytime")
private Date dt3;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getDt1() {
		return dt1;
	}
	public void setDt1(Date dt1) {
		this.dt1 = dt1;
	}
	public Date getDt2() {
		return dt2;
	}
	public void setDt2(Date dt2) {
		this.dt2 = dt2;
	}
	public Date getDt3() {
		return dt3;
	}
	public void setDt3(Date dt3) {
		this.dt3 = dt3;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3=" + dt3 + "]";
	}

}
