package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	   ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/config.xml");
		Emp emp1 = context.getBean("emp1",Emp.class); //for automatic type casting
		System.out.println(emp1);
		

	}

}
