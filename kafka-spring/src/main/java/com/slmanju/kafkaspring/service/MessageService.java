package com.slmanju.kafkaspring.service;

import com.slmanju.kafkaspring.message.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final KafkaMessageProducer kafkaMessageProducer;

    @Autowired
    public MessageService(KafkaMessageProducer kafkaMessageProducer) {
        this.kafkaMessageProducer = kafkaMessageProducer;
    }

    public void sendMessage(String message) {
        kafkaMessageProducer.send(message);
    }

}
