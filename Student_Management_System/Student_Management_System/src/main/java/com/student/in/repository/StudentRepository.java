package com.student.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.in.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
