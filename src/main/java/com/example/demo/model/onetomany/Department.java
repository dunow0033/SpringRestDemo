package com.example.demo.model.onetomany;

import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="Department")
public class Department {
	@Id
	private int deptcode;
	
	private String deptname;
	private String city;
	
	@OneToMany
	@JoinColumn(name="departmentcode")
	private List<Employee> emplist;
	
	public int getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

}
