package com.project.rabbitmq.consumer;

import com.project.rabbitmq.dto.User;
import com.project.rabbitmq.publisher.RabbitMQJsonProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    public static final Logger logger= LoggerFactory.getLogger(RabbitMQJsonProducer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user){
        logger.info(String.format("Json Mesajı geldi->%s",user.toString()));

    }

}
