package com.example.metaPayload.repo;


import com.example.metaPayload.entity.Root;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<Root,String> {
}
