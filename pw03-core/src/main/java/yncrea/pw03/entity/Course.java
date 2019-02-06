package yncrea.pw03.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column(name="validated")
	private boolean validated;
	
	@Column(name="name")
	String name;
	
	@ManyToOne
	private Student student;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="course")
	private List<Work> works;
	
	
	public Course() {
		
	}
	public Course(String name, Student student) {
		
		this.name = name;
		this.student = student;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public void setWorks(List<Work> works) {
		this.works = works;
	}
	public String getName() {
		return name;
	}
	
	
	
	
	
	
}
