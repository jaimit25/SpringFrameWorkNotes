package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();		
	}
	
	
	//this annotation are removed from java 9 so there is a dependency added to pom.xml
	// <context:annotation-config/> use this tag in config.xml file to enable all annotation in the project
	@PostConstruct
	public void start() {
		System.out.println("this is start or init method of annotation package");
	}

	@PreDestroy
	public void end() {
		System.out.println("this is end or destroy method of annotation package");
	}

	
	
	
}
