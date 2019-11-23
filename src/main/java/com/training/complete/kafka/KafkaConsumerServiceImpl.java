package com.training.complete.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public KafkaConsumerServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @KafkaListener(topics = "users", groupId = "messaging")
    public void consume(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s", message));
        //simpMessagingTemplate.convertAndSend("/topic/messaging", message);
        rabbitTemplate.convertAndSend("messaging", message);
    }
}
