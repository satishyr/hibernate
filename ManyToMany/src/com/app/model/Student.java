package com.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
@Id
@Column(name="sid")
	private int sid;
@Column(name="sname")
	private String sname;
@Column(name="smarks")
	private double smarks;
@ManyToMany
@JoinTable(name="stdcrstab",joinColumns=@JoinColumn(name="sidfk"),inverseJoinColumns=@JoinColumn(name="cidfk"))
	private Set<Course> cobs=new HashSet<Course>(0);
public Student() {
	super();
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getSmarks() {
	return smarks;
}
public void setSmarks(double smarks) {
	this.smarks = smarks;
}
public Set<Course> getCobs() {
	return cobs;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", cobs=" + cobs + "]";
}
public void setCobs(Set<Course> cobs) {
	this.cobs = cobs;
}

}
