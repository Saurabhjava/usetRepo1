package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${eid}")
	private int empid;
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Autowired
	private Address address;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployee() {
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("======Address Details=======");
		System.out.println("City="+address.getCity());
		System.out.println("Country="+address.getCountry());
		System.out.println("Zip="+address.getZip());
	}
	
}
