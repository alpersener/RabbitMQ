package com.project.rabbitmq.publisher;

import com.project.rabbitmq.dto.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQJsonProducer {
    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    public static final Logger logger= LoggerFactory.getLogger(RabbitMQJsonProducer.class);




    public void sendJsonMessage(User user){
        logger.info("Json Mesajı Gönderildi->"+user.toString());
        rabbitTemplate.convertAndSend(exchange,routingJsonKey,user);

    }

}
