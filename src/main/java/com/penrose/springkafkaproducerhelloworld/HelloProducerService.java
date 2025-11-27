package com.penrose.springkafkaproducerhelloworld;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducerService {

    private final KafkaTemplate<String, Greeting> kafkaTemplate;

    public HelloProducerService(KafkaTemplate<String, Greeting> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public void sendHello() {
//        kafkaTemplate.send("hello-world", "Hello, Kafka!");
//    }

    public void sendGreeting() {
        Greeting greeting = new Greeting("Penrose", "Hello, JSON!");
        kafkaTemplate.send("goodnite-world",greeting);
    }

//
//    public void sendGoodNight() {
//        kafkaTemplate.send("goodnite-world", "Goodnight, Kafka!");
//    }
//
//    public void sendCustom(String message,String key) {
//        kafkaTemplate.send("goodnite-world", key, message);
//    }
}