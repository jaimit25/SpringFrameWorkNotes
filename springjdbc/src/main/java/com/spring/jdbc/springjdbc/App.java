//short cut to search file command + shift + h

package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
        JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class);
        	
        	
        //proper jdbc structure
        
        //create object of the Interace and not the implementation class
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);                                
        
        //creating object and then uploading them in database
        Student student = new Student();
        student.setId(666);
        student.setName("John");
        student.setCity("Hyderabad");
        int result = studentDao.insert(student);
        
        System.out.println("Successfully Uploaded to Database.."+result);
                  
        
        //For reference not with proper structure we are using jdbc
       //query which will be fired
        //String query = "insert into student(id,name,city) values(?,?,?)";
        
        //update method will replace the ? with the value
        //int result = template.update(query,456,"Janavi Panchal","Mumbai");
        //System.out.println("Number of record inserted..."+result);
        
    }
}
 