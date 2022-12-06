package com.example.eCourseBackendapp.Dao;

import com.example.eCourseBackendapp.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
