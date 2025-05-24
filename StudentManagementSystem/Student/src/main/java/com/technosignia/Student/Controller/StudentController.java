package com.technosignia.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.Student.Entity.Student;
import com.technosignia.Student.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/items")
	public Student addStudentDetails(@RequestBody Student student) {
		return  studentservice.addStudentDetails(student);
	}

	@GetMapping("/items")
	
	public List<Student> getStudentDetails(Student student) {
		return studentservice.getStudentDetails(student);
	}
	
	@PutMapping("/items/{id}")
	public Student editStudentDetails(@RequestBody Student student ,@PathVariable Long id) {
		return studentservice.editStudentDetails(student, id);
	}
	
	@DeleteMapping("/items/{id}")
	public String deleteStudentDetails(@PathVariable Long id) {
		return studentservice.deleteStudentDetails(id);
	}
	
	
		
	}


