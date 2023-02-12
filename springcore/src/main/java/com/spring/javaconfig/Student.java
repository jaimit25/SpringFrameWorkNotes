package com.spring.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("stud") - we can use this too
// replacement of componentAnnotation using @bean annotation in configuration file - [we need to config this is javaconfig class where @Configuration is used]
public class Student {	
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public void study() {
		System.out.println("Student in reading book");
		this.samosa.display();
	}
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	
}
