package com.javaBrain.courseApi.Service;

import com.javaBrain.courseApi.Model.Topics;
import com.javaBrain.courseApi.Repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@Service
public class TopicsService {
    @Autowired
    private TopicRepo topicRepo;
    public List<Topics> getAllTopics(){
        List<Topics> topicsList=new ArrayList<>();
        topicRepo.findAll().forEach(topicsList::add);
        return topicsList;
    }

    public Optional<Topics> getTopicById(String id){
        return topicRepo.findById(id);
    }
    public void addTopics(Topics topic) {
         topicRepo.save(topic);
    }
    public void UpdateTopics(String id,Topics topic) {
       topicRepo.save(topic);
    }
    public void deleteTopicById(String id) {
        topicRepo.deleteById(id);
    }
}
