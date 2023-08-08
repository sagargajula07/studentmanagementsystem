package com.student.in.service;

import java.util.List;

import com.student.in.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(Long Id);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(Long Id);
}
