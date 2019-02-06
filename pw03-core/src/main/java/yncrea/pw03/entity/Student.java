package yncrea.pw03.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="firstname")
	private String lastname;
	
	@Column(name="lastname", nullable=false)
	private String firstname;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="student")
	private List<Course> courses;
	
	public void setId(long id) {
		this.id = id;
	}

	public Student() {
		
	}
	
	public Student(String lastname, String firstname) {
		
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public String getLastname() {
		return lastname;
	}
	
	
}
