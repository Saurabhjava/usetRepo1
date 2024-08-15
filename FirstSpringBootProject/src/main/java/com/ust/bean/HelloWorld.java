package com.ust.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public String sayHello(String name) {
		return "Hello "+name;
	}
}
