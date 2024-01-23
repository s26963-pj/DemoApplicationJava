package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public Student add(Student student){

        return studentRepository.addStudent(student);
    }
    public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();
    }
}
