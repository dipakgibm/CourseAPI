package com.javaBrain.courseApi.Controller;

import com.javaBrain.courseApi.Model.Course;
import com.javaBrain.courseApi.Model.Topics;
import com.javaBrain.courseApi.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id){
        return courseService.getAllCourse(id);
    }

    @RequestMapping("/topics/{topicsId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicsId}/courses")
    public void addCourse(@RequestBody Course course ,@PathVariable String topicsId)
    {
        course.setTopics(new Topics(topicsId,"",""));
        courseService.addCourse(course);

    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicsId}/courses/{id}")
    public void updateCourse(@RequestBody Course course ,@PathVariable String topicsId,@PathVariable String id){
        course.setTopics(new Topics(topicsId,"",""));
        courseService.UpdateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicsId}/courses/{id}")
    public void deleteTopicById(@PathVariable String id)
    {
         courseService.deleteCourseById(id);
    }
}
