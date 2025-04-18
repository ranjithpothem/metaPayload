package com.example.metaPayload.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Change {

    private Value value;

    public Change(Value value) {
        this.value = value;
    }

    public Change() {
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

//    @Override
//    public String toString() {
//        return "Change{" +
//                "value=" + value +
//                '}';
//    }
}
