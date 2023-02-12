package com.spring.springexpressionlanguage;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.stereotype.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/springexpressionlanguage/config.xml");
		
		Demo demo = con.getBean("demo",Demo.class);
		System.out.println(demo);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp =  (Expression) temp.parseExpression("12+13");		
//			System.out.println(exp.getValue());
		
	
	}

}
