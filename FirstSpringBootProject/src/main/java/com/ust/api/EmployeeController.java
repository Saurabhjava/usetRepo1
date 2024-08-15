package com.ust.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bean.Employee;
import com.ust.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(produces = {"application/json","application/xml"})
	public List<Employee> getAll() {
		return service.getAllEmployee();
	}
	
	@GetMapping("/{eid}")
	@SuppressWarnings("all")
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid) {
		Employee e=service.getEmployee(eid);
		if(e!=null) 
			return new ResponseEntity<Employee>(e,HttpStatus.OK);
		else
			return new ResponseEntity("Employee Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		return emp;
	}
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {	
		return service.updateEmployee(emp);
	}
}
