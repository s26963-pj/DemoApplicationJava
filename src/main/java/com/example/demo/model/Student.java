package com.example.demo.model;

import com.example.demo.exceptions.ValidationException;

public class Student {
    private static Integer id = 0;
    private Integer studentId;
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        if (name.isBlank() || lastName.isBlank()){
            throw new ValidationException("Name and last name cannot be blank");
        }else {
            this.studentId = id;
            id++;
            this.name = name;
            this.lastName = lastName;
        }
    }
}
