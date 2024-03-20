package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="Studentid")
	private int studentid;
	
	@Column(name="Studentname")
	private String studentname;
	
	@Column(name="score")
	private int score;
	
	public int getStudentid() {
		return studentid;
	}
	
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Address getAddobj() {
		return addobj;
	}
	public void setAddobj(Address addobj) {
		this.addobj = addobj;
	}
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	
	//this is the foreign key....addid
	@JoinColumn(name="addid")
	private Address addobj;

}