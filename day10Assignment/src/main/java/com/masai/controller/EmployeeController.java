package com.masai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public java.util.List<Employee> getAllEmployee(){
		
		return List.of(
				new Employee(101,"aman",600000),
				new Employee(102,"shubham",650000),
				new Employee(103,"amit",800000)
				);
	}
	
	
	@GetMapping("/employee/101")
	public Employee getEmployee() {
		return new Employee(101,"aman",600000);
	}
}
