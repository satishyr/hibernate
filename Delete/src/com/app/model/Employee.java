package com.app.model;
import javax.persistence.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="empid")
	private int empid;
	@Column(name="empname")
	private String empname;
@Column(name="empsal")
	private double empsal;
@Transient
	private int empcode;
public Employee() {
	super();
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
public int getEmpcode() {
	return empcode;
}
public void setEmpcode(int empcode) {
	this.empcode = empcode;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empcode=" + empcode + "]";
}

	

}
