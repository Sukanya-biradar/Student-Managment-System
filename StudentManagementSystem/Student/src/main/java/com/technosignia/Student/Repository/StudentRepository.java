package com.technosignia.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.Student.Entity.Student;
@Repository

public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
