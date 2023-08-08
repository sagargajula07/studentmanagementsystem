package com.student.in.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.in.entity.Student;
import com.student.in.repository.StudentRepository;
import com.student.in.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository StudentRepository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub		
		return StudentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long Id) {
		// TODO Auto-generated method stub
		return StudentRepository.findById(Id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long Id) {
		// TODO Auto-generated method stub
		StudentRepository.deleteById(Id);
	}

}
