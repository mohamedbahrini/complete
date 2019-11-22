package com.training.complete.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerServiceImpl.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        logger.info(String.format("$$ -> Producing message --> %s",message));
        this.kafkaTemplate.send(TOPIC,message);
    }
}
