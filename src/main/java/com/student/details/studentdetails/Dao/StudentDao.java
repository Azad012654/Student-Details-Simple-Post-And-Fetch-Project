package com.student.details.studentdetails.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.details.studentdetails.model.Student;

@Repository
public interface StudentDao extends MongoRepository<Student, String> {

}
