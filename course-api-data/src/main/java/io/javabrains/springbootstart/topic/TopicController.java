package io.javabrains.springbootstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/allTopics")
	public List<Topic> returnTopic(){
			return topicService.returnAllTopic();
	}
	
	@RequestMapping("/allTopics/{id}")
	public Topic getFiesrRow(@PathVariable String id){
		System.out.println("----"+id);
		return topicService.getFiestRow(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/allTopics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/allTopics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/allTopics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}

}
