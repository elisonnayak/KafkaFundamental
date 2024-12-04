package com.example.springboot.kafka.consumer;

import com.example.springboot.kafka.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    public static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "kafka101", groupId = "nayakzGroup")
    public void consumeMessage(String message) {
        LOGGER.info(String.format("Messsage received %s", message));
    }
}
