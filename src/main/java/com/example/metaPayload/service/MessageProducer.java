package com.example.metaPayload.service;


import com.example.metaPayload.entity.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {


    private String KAFKA_CALLBACK_STATUSES_TOPIC_1="callBack";

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void sendingKafkaTopicToMongoDB(Root root){
        System.out.println("sending topic to kafka");
        kafkaTemplate.send("callBack",root);
        System.out.println("sucessfully send to kafka");
    }
}
