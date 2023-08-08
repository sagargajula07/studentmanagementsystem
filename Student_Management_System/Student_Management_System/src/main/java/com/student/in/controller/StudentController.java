package com.student.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.in.entity.Student;
import com.student.in.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/students",method=RequestMethod.GET)
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@RequestMapping(path="/students/new",method=RequestMethod.GET)
	public String createStudentData(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@RequestMapping(path="/students",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@RequestMapping(path="/students/edit/{id}",method=RequestMethod.GET)
	public String updateStudent(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@RequestMapping(path="/students/{id}",method=RequestMethod.POST)
	public String editStudent(@PathVariable Long id,@ModelAttribute("student")  Student student,Model model) {
		Student old_Student = studentService.getStudentById(id);
		
		old_Student.setId(id);
		old_Student.setEmail(student.getEmail());
		old_Student.setFirstName(student.getFirstName());
		old_Student.setLastName(student.getLastName());
		
		studentService.updateStudent(old_Student);
		
		return "redirect:/students";
	}
	
	
	@RequestMapping(path="/students/{id}",method=RequestMethod.GET)
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
