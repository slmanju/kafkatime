package com.slmanju.kafkaspring.controller;

import com.slmanju.kafkaspring.dto.Message;
import com.slmanju.kafkaspring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody Message message) {
        messageService.sendMessage(message.getText());
    }

}
