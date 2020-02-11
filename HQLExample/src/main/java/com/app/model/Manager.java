package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	@Id
	@Column(name="mid")
	private int mid;
	@Column(name="mname")
	private String mname;
	@Column(name="mfee")
	private double mfee;
	public Manager() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMfee() {
		return mfee;
	}
	public void setMfee(double mfee) {
		this.mfee = mfee;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", mname=" + mname + ", mfee=" + mfee + "]";
	}

}
