package com.ashish.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {	
	Address address;
	
	public Student() {
		
	}

	@Autowired
	public Student( Address address) {
		this.address = address;
		System.out.println("Inside Constructor");
	}

	
	public Address getAddress() {
		
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter :");
	}

	@Override
	public String toString() {
		return "Student [ address=" + address + "]";
	}

}
