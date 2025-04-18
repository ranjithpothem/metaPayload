package com.example.metaPayload.service;


import com.example.metaPayload.entity.Metadata;
import com.example.metaPayload.entity.Root;
import com.example.metaPayload.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repo repo;

    public void save(Root root){
        repo.save(root);

        // Accessing nested properties
        String status = root.getEntry()
                .get(0) // First Entry
                .getChanges()
                .get(0) // First Change
                .getValue() // Access Value Object
                .getStatuses()
                .get(0) // First Status
                .getStatus();


        Metadata metadata = root.getEntry()
                .get(0)
                .getChanges()
                .get(0)
                .getValue()
                .getMetadata();
    }
}
