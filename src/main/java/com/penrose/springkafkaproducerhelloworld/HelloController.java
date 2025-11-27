package com.penrose.springkafkaproducerhelloworld;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    private final HelloProducerService producerService;

    public HelloController(HelloProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/fixed")
    public String sendFixed() {
        producerService.sendHello();
        return "Sent fixed message";
    }

    @PostMapping("/custom")
    public String sendCustom(@RequestBody String message, @RequestParam String key) {
        producerService.sendCustom(message,key);
        System.out.println("Message sent: " + message);
        System.out.println("Key sent: " + key);
        return "Sent custom message";
    }
}