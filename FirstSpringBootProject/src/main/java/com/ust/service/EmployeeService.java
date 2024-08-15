package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.bean.Employee;
import com.ust.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmployee(Employee emp) {
		Employee e=repo.saveAndFlush(emp);
		return e;
	}
	
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}
	
	public Employee getEmployee(int eid) {
		Optional<Employee> op=repo.findById(eid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	
	public List<Employee> getEmployeeByName(String name) {
		return repo.findByName(name);
	}
	public String deleteEmployee(int eid) {
		Employee e=getEmployee(eid);
		if(e!=null) {
			repo.delete(e);
			return "Employee Deleted....";
		}
		else
			return "Employee Not Available";
	}
	public String updateEmployee(Employee emp) {
		Employee e=getEmployee(emp.getEmpid());
		if(e!=null) {
			repo.saveAndFlush(emp);
			return "Employee Email Updated";
		}
		else
			return "Employee Not Available";
	}
	
}
