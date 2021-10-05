package com.talibi.emsAng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talibi.emsAng.models.Employee;
import com.talibi.emsAng.repositories.EmployeeRepository;


@RestController
@RequestMapping("/api/v1/")
public class EmployeeControler {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
