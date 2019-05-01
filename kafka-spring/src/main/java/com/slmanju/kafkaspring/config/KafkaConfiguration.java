package com.slmanju.kafkaspring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    public static final String TOPIC_NAME = "kafka-spring";

    @Bean
    public NewTopic topic() {
        return new NewTopic(TOPIC_NAME, 3, (short) 1);
    }

}
