package com.org.dpm.repository;

import com.org.dpm.model.SeniorFaculty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeniorRepo extends MongoRepository<SeniorFaculty,Integer> {

}
