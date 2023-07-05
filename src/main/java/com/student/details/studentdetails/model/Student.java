package com.student.details.studentdetails.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="studentlist")
public class Student {
	
	private String fname;
	private String lname;
	private Date dob;
	private String parentname;
	private String address;
	private String city;
	private String phone;
	
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", parentname=" + parentname
				+ ", address=" + address + ", city=" + city + ", phone=" + phone + "]";
	}
	public Student(String fname, String lname, Date dob, String parentname, String address, String city, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.parentname = parentname;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
