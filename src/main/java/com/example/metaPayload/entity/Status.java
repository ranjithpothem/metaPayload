package com.example.metaPayload.entity;

import org.springframework.stereotype.Component;


public class Status {
    private String status;

    public Status(String status) {
        this.status = status;
    }

    public Status() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    @Override
//    public String toString() {
//        return "Status{" +
//                "status='" + status + '\'' +
//                '}';
//    }
}
