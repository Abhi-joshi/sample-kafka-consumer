package com.abhishek.samplekafkaconsumer.listener;

import com.abhishek.samplekafkaconsumer.model.Wikimedia;
import com.abhishek.samplekafkaconsumer.service.WikimediaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);
    private final WikimediaService wikimediaService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public MessageListener(WikimediaService wikimediaService) {
        this.wikimediaService = wikimediaService;
    }

    @KafkaListener(
            topics = "#{ '${app.kafka.topic}' }",
            groupId = "#{ '${spring.kafka.consumer.group-id}' }"
    )
    public void listen(String message) {
        Wikimedia result;
        try {
            result = objectMapper.readValue(message, Wikimedia.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        this.wikimediaService.save(result);
    }
}
