package com.example.demo.model.onetomany;

import jakarta.persistence.Id;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	private int empid;
	
	private String empname;
	
	private double salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
