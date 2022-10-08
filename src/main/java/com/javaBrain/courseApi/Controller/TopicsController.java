package com.javaBrain.courseApi.Controller;

import com.javaBrain.courseApi.Model.Topics;
import com.javaBrain.courseApi.Service.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicsController {

    @Autowired
    private  TopicsService topicsService;


    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topics> getTopicById(@PathVariable String id){
        return topicsService.getTopicById(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void
    addTopics(@RequestBody Topics topics){
        topicsService.addTopics(topics);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopics(@RequestBody Topics topics,@PathVariable String id){
        topicsService.UpdateTopics(id,topics);
    }

    @RequestMapping(method =RequestMethod.DELETE ,value = "/topics/{id}")
    public void deleteTopicById(@PathVariable String id){
         topicsService.deleteTopicById(id);
    }
}
