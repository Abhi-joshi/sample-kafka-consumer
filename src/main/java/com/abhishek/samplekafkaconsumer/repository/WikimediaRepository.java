package com.abhishek.samplekafkaconsumer.repository;

import com.abhishek.samplekafkaconsumer.model.Wikimedia;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  WikimediaRepository extends ReactiveCrudRepository<Wikimedia, String> {
}
