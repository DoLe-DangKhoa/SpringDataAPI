package com.example.springdataapi.controller;

import com.example.springdataapi.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/home")
    public String home(){
        return "hello world";
    }
}

