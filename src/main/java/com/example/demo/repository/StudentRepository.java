package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

    public Student addStudent(Student student){
        studentList.add(student);

        return student;
    }
    public List<Student> getAllStudents(){
        return studentList;
    }

    public void deleteAll(){
        studentList = new ArrayList<>();
    }
}
