package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // this will remove the use of config.xml file
@ComponentScan(basePackages="com.spring.javaconfig") // this will collect all the beans from this package 
public class JavaConfig {
	
	//this method will return bean object also the name of the method should be similar to ApplicationContext.getBean() method ie. stud;
	// we can remove @ComponentScan(basePackages="com.spring.javaconfig") when using @Bean Annotation 
	@Bean 
	public Student stud() {
		Student std = new Student(getSamosa());		
		return std;
	}
	
	@Bean(name= {"samosa","samosa2"}) // we can enter any name in case we have specified something else in the ApplicationContext.getBean() Method
	public Samosa getSamosa() {
		return new Samosa();
	}
}
