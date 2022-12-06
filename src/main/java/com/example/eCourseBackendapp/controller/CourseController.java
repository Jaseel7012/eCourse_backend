package com.example.eCourseBackendapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public  String Home(){
        return "home";
    }
    @GetMapping("/add")
    public String Add(){
        return "add course";
    }
    @GetMapping("/view")
    public  String View(){
        return "view course";
    }
}
