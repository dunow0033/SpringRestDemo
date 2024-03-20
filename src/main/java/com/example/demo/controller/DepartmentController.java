package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.DepartmentRepository;
import com.example.demo.model.onetomany.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	DepartmentRepository deptrep;
	
	@PostMapping("/insert")
	public Department insertData(@RequestBody Department d)
	{
		return deptrep.save(d);
	}

}
