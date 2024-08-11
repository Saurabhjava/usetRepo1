package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public @ResponseBody String sayHello() {
		return "Hello Spring MVC!!!";
	}
	@RequestMapping("/hi")
	public String sayHello1(Model m,@RequestParam("t1") String uname, @RequestParam("t2") String pass) {
		
		m.addAttribute("UserName", uname);
		m.addAttribute("Password", pass);
		return "Welcome";
	}
}
