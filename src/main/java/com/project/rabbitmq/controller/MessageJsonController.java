package com.project.rabbitmq.controller;

import com.project.rabbitmq.dto.User;
import com.project.rabbitmq.publisher.RabbitMQJsonProducer;
import com.project.rabbitmq.publisher.RabbitMQProducer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class MessageJsonController {

    private final RabbitMQJsonProducer producer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        producer.sendJsonMessage(user);
        return ResponseEntity.ok("Json Mesajı Gönderildi.!");


    }
}
