package com.spring.jdbc.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate template;
	
	public int insert(Student student) {	
		//query which will be fired
        String query = "insert into student(id,name,city) values(?,?,?)";
        int result = this.template.update(query,student.getId(),student.getName(),student.getCity());        
		return result;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	
}
