package yncrea.pw03.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

import yncrea.pw03.entity.Student;
import yncrea.pw03.service.StudentService;
import yncrea.pw03.dao.StudentDAO;

public class StudentServiceImpl implements StudentService {
	@Inject
	private StudentDAO studentDAO;
	
	@Transactional
	public List<Student> findByLastname(String lastname){
		return studentDAO.findByLastname(lastname);
	}
	
	public void saveStudent(Student Student) {
		studentDAO.saveStudent(Student);
	}
	
	public List<Student> findAll(){
		return studentDAO.findAll();
	}
}
