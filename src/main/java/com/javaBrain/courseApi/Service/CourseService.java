package com.javaBrain.courseApi.Service;

import com.javaBrain.courseApi.Model.Course;
import com.javaBrain.courseApi.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public List<Course> getAllCourse(String topicId){
        List<Course> coursesList=new ArrayList<>();
        courseRepo.findByTopicsId(topicId).forEach(coursesList::add);
        return coursesList;
    }

    public Optional<Course> getCourse(String id){
        return courseRepo.findById(id);
    }

    public void addCourse(Course course)
    {
         courseRepo.save(course);
    }
    public void UpdateCourse(Course  course) {

        courseRepo.save(course);
    }
    public void deleteCourseById(String id) {
        courseRepo.deleteById(id);
    }

}
