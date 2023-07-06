package com.student.details.studentdetails.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.details.studentdetails.Dao.StudentDao;
import com.student.details.studentdetails.model.Student;




@RestController
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentDao studentdao;

	@PostMapping("/create-student")
	public ResponseEntity<?> postStudent(@RequestBody Student student){
		try {
			System.out.println(student);
		studentdao.save(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/get-student")
	public ResponseEntity<?> getStudent(){
			
			List<Student> student = studentdao.findAll();
			if(student.size()>0) {
			return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
		}else{
			return new ResponseEntity<>("No Data Found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
