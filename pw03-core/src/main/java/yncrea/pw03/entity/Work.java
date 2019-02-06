package yncrea.pw03.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Work {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	String name;
	
	@ManyToOne
	private Course course;
	
	@Column(name="grade")
	private int grade;
	
	
	public Work() {
		
	}
	public Work(String name, int grade, Course course) {
		
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
