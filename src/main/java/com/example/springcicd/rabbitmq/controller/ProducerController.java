package com.example.springcicd.rabbitmq.controller;

import com.example.springcicd.rabbitmq.dto.Message;
import com.example.springcicd.rabbitmq.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final Producer producer;

    @PostMapping("/send")
    public String send(Message message) {
        producer.sendMessage(message);
        return "send test";
    }

}
