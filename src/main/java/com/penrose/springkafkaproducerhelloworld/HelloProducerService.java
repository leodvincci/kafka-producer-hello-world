package com.penrose.springkafkaproducerhelloworld;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public HelloProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendHello() {
        kafkaTemplate.send("hello-world", "Hello, Kafka!");
    }



    public void sendGoodNight() {
        kafkaTemplate.send("goodnite-world", "Goodnight, Kafka!");
    }

    public void sendCustom(String message,String key) {
        kafkaTemplate.send("goodnite-world", key, message);
    }
}