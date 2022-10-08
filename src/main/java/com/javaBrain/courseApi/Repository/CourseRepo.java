package com.javaBrain.courseApi.Repository;

import com.javaBrain.courseApi.Model.Course;
import com.javaBrain.courseApi.Model.Topics;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepo extends CrudRepository<Course,String > {
    public List<Course> findByTopicsId(String topicsId);



}
