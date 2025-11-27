package com.penrose.springkafkaproducerhelloworld;

public record Greeting(String eventId, String source, String eventType, String version, String shipmentId, String departedAt, String status, String arrivedAt, String arrivalStatus, String arrivalLocation, String arrivalTime) {
}
