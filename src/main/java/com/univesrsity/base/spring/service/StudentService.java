package com.univesrsity.base.spring.service;

import com.univesrsity.base.spring.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

  List<Student> getAllStudents();

  Student saveStudent(Student student);

  Optional<Student> getStudentById(Long id);

  Student updateStudent(Student student);

  void deleteStudentById(Long id);
}
