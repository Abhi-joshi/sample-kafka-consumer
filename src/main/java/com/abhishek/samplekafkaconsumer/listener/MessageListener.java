package com.abhishek.samplekafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(
            topics = "#{ '${app.kafka.topic}' }",
            groupId = "#{ '${spring.kafka.consumer.group-id}' }"
    )
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
