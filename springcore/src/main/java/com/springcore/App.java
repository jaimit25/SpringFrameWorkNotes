package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //set up Everything in a XML file so we use ClassPathXmlApplicationContext...
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); // config file in resources folder
        
       Student student1 = (Student) context.getBean("student1");
       System.out.println(student1.toString());
       
       Student student2 = (Student) context.getBean("student2");
       System.out.println(student2.toString());
       
       Student student3 = (Student) context.getBean("student3");
       System.out.println(student3.toString());
       
       
    }
}
