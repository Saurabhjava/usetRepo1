package com.ust.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findByName(String name);
}
