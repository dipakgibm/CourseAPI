package com.javaBrain.courseApi.Repository;

import com.javaBrain.courseApi.Model.Topics;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topics,String > {

}
