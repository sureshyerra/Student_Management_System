package com.example.Student_Management_System;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController//
public class StudentController {

    HashMap<Integer,Student> hashMap = new HashMap<>();
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){

        int key = student.getRollNo();

        hashMap.put(key,student);

    }
    @GetMapping("/getStudentInfo")
    // find the student whose rollno is
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){
        // we should get that object of particular roll no
        Student student = hashMap.get(rollNo);

        return student;

    }





}
