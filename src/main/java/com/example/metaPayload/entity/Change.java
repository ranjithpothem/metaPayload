package com.example.metaPayload.entity;

public class Change {
    private Value value;

    public Change(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
