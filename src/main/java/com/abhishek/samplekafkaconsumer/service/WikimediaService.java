package com.abhishek.samplekafkaconsumer.service;

import com.abhishek.samplekafkaconsumer.model.Wikimedia;
import com.abhishek.samplekafkaconsumer.repository.WikimediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WikimediaService {

    private static final Logger logger = LoggerFactory.getLogger(WikimediaService.class);
    private final WikimediaRepository wikimediaRepository;

    public WikimediaService(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    public void save(Wikimedia wikimedia) {
        wikimediaRepository.save(wikimedia)
                .subscribe(saved -> logger.info("Document saved: {}", saved),
                        error -> logger.error("Error while saving: {}", String.valueOf(error)));
    }

}
