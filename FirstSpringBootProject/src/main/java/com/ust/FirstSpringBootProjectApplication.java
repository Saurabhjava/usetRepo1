package com.ust;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.Employee;
import com.ust.bean.HelloWorld;
import com.ust.service.EmployeeService;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		//EmployeeService es=ctx.getBean(EmployeeService.class);
		//es.saveEmployee(new Employee("Swati", "swati@gmail.com"));
		/*
		 * List<Employee> emps=es.getAllEmployee();
		 * 
		 * for(Employee e:emps) { System.out.println(e.getEmpid()+"\t"+
		 * e.getName()+"\t"+e.getEmail()); }
		 */
		
		/*
		 * Employee e=es.getEmployee(102); if(e!=null)
		 * System.out.println(e.getEmpid()+"\t"+ e.getName()+"\t"+e.getEmail()); else
		 * System.out.println("Employee Not Found")
		 */;
		 
		/*
		 * List<Employee> li=es.getEmployeeByName("Manu"); for(Employee e:li)
		 * System.out.println(e.getEmpid()+"\t"+ e.getName()+"\t"+e.getEmail());
		 */
			 
		// System.out.println(es.deleteEmployee(2));
		// System.out.println(es.updateEmployeeEmail(52, "abc@gmail.com"));
	}

}
