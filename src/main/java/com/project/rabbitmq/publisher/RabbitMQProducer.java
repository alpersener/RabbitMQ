package com.project.rabbitmq.publisher;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQProducer {

    private final RabbitTemplate rabbitTemplate;

    private static final Logger logger= LoggerFactory.getLogger(RabbitMQProducer.class);

    @Value("${rabbitmq.exchange.name}")
    private String exhange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;


    public void sendMessage(String message){
        logger.info(String.format("Message Gönderildi-> %s",message));
        rabbitTemplate.convertAndSend(exhange,routingKey,message);

    }



}

