package com.example.metaPayload.entity;

import com.mongodb.client.model.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Document(collation = "root")
public class Root {

    @Autowired
    private List<Entry> entry;

    public Root(List<Entry> entry) {
        this.entry = entry;
    }

    // Getters and setters
    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}

