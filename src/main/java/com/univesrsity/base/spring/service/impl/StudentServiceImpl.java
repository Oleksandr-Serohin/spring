package com.univesrsity.base.spring.service.impl;

import com.univesrsity.base.spring.entity.Student;
import com.univesrsity.base.spring.repository.StudentRepository;
import com.univesrsity.base.spring.service.StudentService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Optional<Student> getStudentById(Long id) {
    if (studentRepository.findById(id).isPresent()) {
      return Optional.of(studentRepository.findById(id).get());
    }
    return Optional.empty();
  }

  @Override
  public Student updateStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public void deleteStudentById(Long id) {
    studentRepository.deleteById(id);
  }
}