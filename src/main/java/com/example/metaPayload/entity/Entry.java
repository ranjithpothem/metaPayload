package com.example.metaPayload.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Entry {
    public List<Change> changes;

    public Entry(List<Change> changes) {
        this.changes = changes;
    }

    public Entry() {
    }

    public List<Change> getChanges() {
        return changes;
    }

    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }
}
