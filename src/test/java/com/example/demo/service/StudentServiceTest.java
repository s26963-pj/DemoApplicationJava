package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private static StudentService studentService;
    private static StudentRepository studentRepository;

    @BeforeAll
    public static void setUp(){
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
    }

    @Test
    void shouldAddStudentToList(){
        Student student = new Student("Jan", "Kowalski");
        Student result = assertDoesNotThrow(() -> studentService.add(student));

        assertEquals(result.getName(), student.getName());
    }

}