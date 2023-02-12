package com.spring.auto.wire;

public class Emp {
	
	private Address address;
	
	public Emp() {
		super();
		
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.print("Constructor Called");
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
	
}
