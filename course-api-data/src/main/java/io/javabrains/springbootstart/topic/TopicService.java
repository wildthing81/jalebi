package io.javabrains.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> TOPIC=new ArrayList<>(Arrays.asList(new Topic("SpringBook","Kaushik"),
			new Topic("SpringBookGuru","GuRuji"),
			new Topic("SpringRefrence","SpringSource")));
	
	public List<Topic> returnAllTopic(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getFiestRow(String name){
		return topicRepository.findOne(name);
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic2, String id) {
		topicRepository.save(topic2);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}