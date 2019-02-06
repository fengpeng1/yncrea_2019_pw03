package yncrea.pw03.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yncrea.pw03.entity.Student;
import yncrea.pw03.dao.StudentDAO;

public interface StudentService {

		
	public List<Student> findByLastname(String lastname);
	
	public void saveStudent(Student Student);
	
//	public void saveStudent(List<Student> Student);
	
	public List<Student> findAll();
	

			
}
