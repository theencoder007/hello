package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;
	
	private String name;
	
	private String city;
	
	private Address adr;
	@Autowired
	public Employee()
	{
	
	}
	
	public Employee(int id,String name,String city,Address adr)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
		this.adr=adr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	
	public void disp()
	{
		System.out.println("ID :"+ id +" "+"Name : "+name+" City : "+city);
		adr.disp();
	}
}
