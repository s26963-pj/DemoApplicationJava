package com.example.demo.controller;

import com.example.demo.exceptions.ValidationException;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        try{
            Student result = studentService.add(student);

            return ResponseEntity.status(201).body(result);
        }catch (ValidationException e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentsList = studentService.getAllStudents();
        return ResponseEntity.ok(studentsList);
    }
}
