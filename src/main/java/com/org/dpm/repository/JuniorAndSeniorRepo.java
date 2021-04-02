package com.org.dpm.repository;

import com.org.dpm.model.SeniorAndJunior;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JuniorAndSeniorRepo extends MongoRepository<SeniorAndJunior,Integer> {
}
