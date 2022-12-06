package com.example.eCourseBackendapp.controller;

import com.example.eCourseBackendapp.Dao.CourseDao;
import com.example.eCourseBackendapp.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public  String Home(){
        return "home";
    }
    @CrossOrigin(origins = "*")
   @PostMapping(path="/addcourse",consumes = "application/json",produces = "application/json")

    public String Add(@RequestBody Course c){

       System.out.println(c.getCourse_title().toString());
       dao.save(c);

        return "add course";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> View(){
        return (List<Course>) dao.findAll();

    }
}
