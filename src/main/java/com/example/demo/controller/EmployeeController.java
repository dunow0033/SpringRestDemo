package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.onetomany.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository emprep;
	
	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee e)
	{
		return emprep.save(e);
	}
}
