package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cfg.MyConfig;

public class Main {

	public static void main(String[] args) {
		
		
		 // ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		  ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		 // Address add=ctx.getBean(Address.class);
		  Employee e=ctx.getBean(Employee.class);
		  //e.setAddress(add);
		  e.printEmployee();
		 
	}

}
