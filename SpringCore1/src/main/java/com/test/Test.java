package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		

		
		Employee e = (Employee)ctx.getBean("emp");
		e.disp();
		
		Employee e1=(Employee)ctx.getBean("pp");
		e1.disp();
		
		
	}

}
