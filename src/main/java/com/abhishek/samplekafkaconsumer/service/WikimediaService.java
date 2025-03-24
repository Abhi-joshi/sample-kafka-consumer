package com.abhishek.samplekafkaconsumer.service;

import com.abhishek.samplekafkaconsumer.model.Wikimedia;
import com.abhishek.samplekafkaconsumer.repository.WikimediaRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WikimediaService {

    private final WikimediaRepository wikimediaRepository;

    public WikimediaService(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    public Mono<Wikimedia> save(Wikimedia wikimedia) {
        return wikimediaRepository.save(wikimedia);
    }

}
