package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@Table(name="emptab20")
@GenericGenerator(name="mygen",strategy="increment")
public class Employee {
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	@Column(name="esal")
	private double esal;
	@ElementCollection
	@CollectionTable(name="eprjtab",joinColumns=@JoinColumn(name="eid"))
	@CollectionId(columns=@Column(name="unqid"),generator="mygen",type=@Type(type="long"))
	@Column(name="data")
	private List<String> eprjs=new ArrayList<String>();
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
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public List<String> getEprjs() {
		return eprjs;
	}
	public void setEprjs(List<String> eprjs) {
		this.eprjs = eprjs;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eprjs=" + eprjs + "]";
	}

}
