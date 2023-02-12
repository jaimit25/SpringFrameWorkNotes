package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean {
	
	public double price;

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		//this method will work as init
		System.out.print("init method for spring pepsi");
		
	}

	public void destroy() throws Exception {
		//this method will work as destroy
		System.out.print("destroy method for spring pepsi");
	}
	
	
}
