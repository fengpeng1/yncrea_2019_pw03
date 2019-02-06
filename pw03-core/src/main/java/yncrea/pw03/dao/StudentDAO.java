package yncrea.pw03.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import yncrea.pw03.entity.Student;

public interface StudentDAO extends JpaRepository<Student,Long> {
	List<Student> findByLastname(String lastname);
	Student saveStudent(Student student);
	List<Student> findAll();
}
