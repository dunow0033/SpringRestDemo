package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.onetomany.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
