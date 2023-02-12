package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired // we can use this annotation on variable name (non primitive data type), setterMethod and Constructor
	@Qualifier("address1") //to select which bean to inject
	private Address address;
	
	public Emp() {
		super();
		
	}
	
	//@Autowired 
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired 
	public void setAddress(Address address) {
		System.out.print("Constructor Called");
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
	
}
