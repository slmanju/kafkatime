package com.slmanju.kafkaspring.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.slmanju.kafkaspring.config.KafkaConfiguration.TOPIC_NAME;

@Component
public class KafkaMessageConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageConsumer.class);

    @KafkaListener(topics = TOPIC_NAME, groupId = "test-id")
    public void consume(String message) {
        LOGGER.info(String.format(":: Consume Message :: %s", message));
    }

}
