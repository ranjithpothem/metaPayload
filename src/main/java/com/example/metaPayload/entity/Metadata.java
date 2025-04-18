package com.example.metaPayload.entity;

import org.springframework.stereotype.Component;


public class Metadata {
    private String display_phone_number;

    public Metadata() {
    }

    public Metadata(String display_phone_number) {
        this.display_phone_number = display_phone_number;
    }

    public String getDisplay_phone_number() {
        return display_phone_number;
    }

    public void setDisplay_phone_number(String display_phone_number) {
        this.display_phone_number = display_phone_number;
    }

//    @Override
//    public String toString() {
//        return "Metadata{" +
//                "display_phone_number='" + display_phone_number + '\'' +
//                '}';
//    }
}
