package com.tka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	private int clsid;
	private String clsname;
	private int clacapacity;
	public int getClsid() {
		return clsid;
	}
	public void setClsid(int clsid) {
		this.clsid = clsid;
	}
	public String getClsname() {
		return clsname;
	}
	public void setClsname(String clsname) {
		this.clsname = clsname;
	}
	public int getClacapacity() {
		return clacapacity;
	}
	public void setClacapacity(int clacapacity) {
		this.clacapacity = clacapacity;
	}
	@Override
	public String toString() {
		return "Clasroom [clsid=" + clsid + ", clsname=" + clsname + ", clacapacity=" + clacapacity + "]";
	}
	public Classroom(int clsid, String clsname, int clacapacity) {
		super();
		this.clsid = clsid;
		this.clsname = clsname;
		this.clacapacity = clacapacity;
	}
	public Classroom() {
		super();
	}
	
}
