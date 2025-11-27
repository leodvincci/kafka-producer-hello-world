package com.penrose.springkafkaproducerhelloworld;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HelloProducerService {

    private final KafkaTemplate<String, Greeting> kafkaTemplate;

    public HelloProducerService(KafkaTemplate<String, Greeting> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public void sendHello() {
//        kafkaTemplate.send("hello-world", "Hello, Kafka!");
//    }

    public void sendGreeting(Greeting greeting,String key) {
        kafkaTemplate.send("goodnite-world",greeting.eventType(),greeting);
        System.out.println("Message sent: " + greeting);
        System.out.println("Key sent: " + key);

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