package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreateCompany {
	@Id
	@GeneratedValue
	private int cId;
	private String cName;
	private String eEmail;
	private long cPhoneNo;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public long getcPhoneNo() {
		return cPhoneNo;
	}
	public void setcPhoneNo(long cPhoneNo) {
		this.cPhoneNo = cPhoneNo;
	}
	@Override
	public String toString() {
		return "CreateCompany [cId=" + cId + ", cName=" + cName + ", eEmail=" + eEmail + ", cPhoneNo=" + cPhoneNo + "]";
	}
	
}
