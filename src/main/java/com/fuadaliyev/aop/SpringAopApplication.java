package com.fuadaliyev.aop;

import com.fuadaliyev.aop.model.Employee;
import com.fuadaliyev.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("Fuad");
		employeeService.setEmployee(employee);
		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Pankaj");

		employeeService.getEmployee().throwException();
	}
}
