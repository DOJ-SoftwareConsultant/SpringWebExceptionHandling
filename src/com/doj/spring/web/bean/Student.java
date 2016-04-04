package com.doj.spring.web.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	@NotNull
	@NotEmpty(message="Your first name is mandatory")
	@Size(max=20, min=5, message="Your first name must be between 5 to 20 characters")
	String fname;
	
	@NotNull
	@NotEmpty(message="Your last name is mandatory")
	@Size(max=20, min=5, message="Your last name must be between 5 to 20 characters")
	String lname;
	
	@NotNull
	@NotEmpty(message="Your address is mandatory")
	@Size(max=50, min=10, message="Your address must be between 10 to 50 characters")
	String address;
	
	@NotNull
	@NotEmpty(message="Your course is mandatory")
	@Size(max=10, min=3, message="Your course must be between 3 to 10 characters")
	String course;
	
	@NotNull
	@NotEmpty(message="Your age is mandatory")
	@Max(value=50, message="Your age should be less than or equal to 50")
	@Min(value=5, message="Your age should be greater than or equal to 5")
	String age;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
