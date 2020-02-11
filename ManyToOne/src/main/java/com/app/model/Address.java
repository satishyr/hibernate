package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addrtabb")
public class Address {
@Id
@Column(name="aid")
	private int aid;
	@Column(name="loc")
	private String loc;
	@Column(name="pin")
	private String pin;
	public Address() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", loc=" + loc + ", pin=" + pin + "]";
	}
	

}
