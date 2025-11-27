package com.penrose.springkafkaproducerhelloworld;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic goodNightWorldTopic() {
        return TopicBuilder.name("goodnite-world")
                .partitions(3)
                .replicas(1)
                .build();
    }

}
