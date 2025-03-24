package com.abhishek.samplekafkaconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @KafkaListener(
            topics = "#{ '${app.kafka.topic}' }",
            groupId = "#{ '${spring.kafka.consumer.group-id}' }"
    )
    public void listen(String message) {
       log.info(message);
    }
}
