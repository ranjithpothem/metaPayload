package com.example.metaPayload.service;

import com.example.metaPayload.entity.Metadata;
import com.example.metaPayload.entity.Root;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {


    @KafkaListener(topics = "callBack" ,groupId = "KAFKA_CALLBACK_STATUSES_TOPIC_1_dlv_DEV_1")
    public void gettingTopicFromKafka(Root root){

        System.out.println(root.toString());

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
