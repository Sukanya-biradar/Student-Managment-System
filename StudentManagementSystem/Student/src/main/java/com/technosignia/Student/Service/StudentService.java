package com.technosignia.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.Student.Entity.Student;
import com.technosignia.Student.Repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepository;
	
	
	public Student addStudentDetails(Student student) {
		return studentrepository.save(student);
	}
	
	public List<Student> getStudentDetails(Student student) {
		return studentrepository.findAll();
	}
	
	 public String deleteStudentDetails(long id) {
	        Optional<Student> optional = studentrepository.findById(id);
	        if (optional.isPresent()) {
	            studentrepository.deleteById(id);
	            return "Student record has been deleted";
	        } else {
	            return "Student record doesn't match";
	        }
	    }
	 
	 public Student editStudentDetails(Student student, long id) {
	        Optional<Student> optional = studentrepository.findById(id);
	        if (optional.isPresent()) {
	            Student s = optional.get();
	            if (student.getName() != null) {
	                s.setName(student.getName());
	            }
	            if (student.getEmail() != null) {
	                s.setEmail(student.getEmail());
	            }
	            if (student.getContact() != null) {
	                s.setContact(student.getContact());
	            }
	            if (student.getAddress() != null) {
	                s.setAddress(student.getEmail());
	            }
	            if (student.getContact() != null) {
	               s.setContact(student.getContact());
	            }
	            
	    		
	            student = studentrepository.save(s);
	        }
	        return student;
	    }

}
