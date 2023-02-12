package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorinjection.Person;

public class Test {

	public static void main(String[] args) {
		
		//Initialising context
		//AbstractApplicationContext - use this context so we can destroy object
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown hook to call the destroy method for interface implementation - pepsi
		context.registerShutdownHook();
				
				
		//Life cycle using XMl file
		Samosa p = (Samosa) context.getBean("samosa");			
		System.out.println(p);//to string method will be called after the constructor initialisation
				
		
		//Life cycle using Annotations - added annotation dependency for java 9 above in pom.xml file and enable annotation in the config.xml file 
		Example e = (Example)context.getBean("example");
		System.out.println(e);
		
		//Life cycle using Java Interface
		pepsi pep = (pepsi)context.getBean("pepsi");
		System.out.println(pep);	
		
		
		
	}
	

}
