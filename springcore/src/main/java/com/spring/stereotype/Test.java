package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		
		//"student object will be automatically created"
		Student stud = con.getBean("student",Student.class);
		//System.out.println(stud);
		//System.out.println(stud.getAddress());
		
		
		// getBeans function will return the same object every time which is called as "singleton" but we sometimes need multiple object 
		// so basically making the object "prototype".
		Student stud2 = con.getBean("student",Student.class);
		System.out.println(stud.hashCode()); // hash code will return the hash of the object
		System.out.println(stud.hashCode()); // add this annotation to the Student class below @Component annotation @Scope("prototype") [scope and component annotation should be used together]
	}

}
