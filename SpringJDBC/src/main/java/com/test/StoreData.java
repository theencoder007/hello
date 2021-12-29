package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StoreData {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustDao cd = (CustDao)ctx.getBean("cdao");
		
		
		
		Customer c = new Customer(4, "FSD", "fsd@gmail.com");
		
		cd.save(c);
		
//		cd.update(c);
		
		//cd.delete(c);
		
//		List<Customer> list = cd.listCustomers();
//		
//		for(Customer data : list)
//		{
//			System.out.println(data.getId()+" "+data.getName()+" "+data.getEmail());
//		}
	}
}
