package com.example.metaPayload.entity;

import java.util.List;

public class Value {
    private List<Status1> statuses;
    private Metadata metadata;

    public Value(List<Status1> statuses, Metadata metadata) {
        this.statuses = statuses;
        this.metadata = metadata;
    }

    public List<Status1> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status1> statuses) {
        this.statuses = statuses;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
