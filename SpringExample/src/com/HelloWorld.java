package com;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String name="Amit";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Welcome "+name+"!";
	}
}
