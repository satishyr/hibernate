package com.app;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
@Column(name="loc")
	private String loc;
@Column(name="code")
	private int pincode;
public Address() {
	super();
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [loc=" + loc + ", pincode=" + pincode + "]";
}

	
	
}
