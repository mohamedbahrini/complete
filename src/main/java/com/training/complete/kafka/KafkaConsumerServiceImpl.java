package com.training.complete.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);

    @KafkaListener(topics = "users", groupId = "messaging")
    public void consume(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s", message));
    }
}
