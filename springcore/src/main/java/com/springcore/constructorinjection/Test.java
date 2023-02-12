package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {		

			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/config.xml");
			Person p = (Person) context.getBean("person");			
			System.out.println(p);//to string method will be called after the constructor initialisation
			

	 
	}

}
