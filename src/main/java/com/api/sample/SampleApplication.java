package com.api.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@ComponentScan("com")
public class SampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	//@KafkaListener(topics = "api-spring-topic", groupId = "api-spring-group")
	//public void listen(String message) {
	//	System.out.println("Received Messasge in group - group-id: " + message);
	//}
}