package com.student.in;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.student.in.entity.Student;
import com.student.in.repository.StudentRepository;


@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	  @Autowired
	  private StudentRepository studentRepository;
	  
	 // public void run(String... args) throws Exception { 
// TODO Auto-generated method stub
	  
	  
			/*
			 * Student s1 = new Student("firstName_1", "lastName_1", "email1@gmail.com");
			 * studentRepository.save(s1);
			 * 
			 * Student s2 = new Student("firstName_2", "lastName_2", "email2@gmail.com");
			 * studentRepository.save(s2);
			 * 
			 * Student s3 = new Student("firstName_3", "lastName_3", "email3@gmail.com");
			 * studentRepository.save(s3);
			 * 
			 * Student s4 = new Student("firstName_4", "lastName_4", "email4@gmail.com");
			 * studentRepository.save(s4);
			 */
	  
	 // }
	 

}
