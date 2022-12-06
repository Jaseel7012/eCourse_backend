package com.example.eCourseBackendapp.controller;

import com.example.eCourseBackendapp.Model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public  String Home(){
        return "home";
    }
   @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course c){
       System.out.println(c.getCourse_title().toString());
        return "add course";
    }
    @GetMapping("/view")
    public  String View(){
        return "view course";
    }
}
