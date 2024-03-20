package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	@Query("select s from Student s join Address a on s.addobj.addressid=:id")
	public List<Student> retrieveStudent(@Param("id") int id);
}
