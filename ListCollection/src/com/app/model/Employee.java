package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="emp3")
public class Employee {
	@Id
	@Column(name="empid")
	private int empid;
	@Column(name="empname")
	private String empname;
	@Column(name="empsal")
	private double empsal;
	@ElementCollection
	@CollectionTable(name="empprojs" ,joinColumns=@JoinColumn(name="sid"))
	@OrderColumn(name="pos")
	@Column(name="Data")
	private List<String> empdata=new ArrayList<String>();
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
	public List<String> getEmpdata() {
		return empdata;
	}
	public void setEmpdata(List<String> empdata) {
		this.empdata = empdata;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empdata=" + empdata
				+ "]";
	}
		

}
