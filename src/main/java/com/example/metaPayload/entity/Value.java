package com.example.metaPayload.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class Value {

    private List<Status> statuses;
    private Metadata metadata;

    public Value() {
    }

    public Value(List<Status> statuses, Metadata metadata) {
        this.statuses = statuses;
        this.metadata = metadata;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

//    @Override
//    public String toString() {
//        return "Value{" +
//                "statuses=" + statuses +
//                ", metadata=" + metadata +
//                '}';
//    }
}
