package com.ust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService service;
	
	@Test
	void getEmployeeTestwithValidId() {
		assertNotNull(service.getEmployee(52));
		assertEquals("Manu", service.getEmployee(52).getName());
	}
	@Test
	void getEmployeeTestwithInvalidId() {
		assertNull(service.getEmployee(1152));
	}
}
