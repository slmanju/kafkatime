package com.slmanju.kafkaspring.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.slmanju.kafkaspring.config.KafkaConfiguration.TOPIC_NAME;

@Component
public class KafkaMessageProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageProducer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaMessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        LOGGER.info(String.format(":: Produce Message :: %s", message));
        kafkaTemplate.send(TOPIC_NAME, message);
    }

}
