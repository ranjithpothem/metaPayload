package com.example.metaPayload.controller;


import com.example.metaPayload.entity.Root;
import com.example.metaPayload.service.MessageProducer;
import com.example.metaPayload.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {

    @Autowired
    private Service service;

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/post")
    public void postMethod(@RequestBody Root root)
    {
          messageProducer.sendingKafkaTopicToMongoDB(root);
        //service.save(root);
    }

}
