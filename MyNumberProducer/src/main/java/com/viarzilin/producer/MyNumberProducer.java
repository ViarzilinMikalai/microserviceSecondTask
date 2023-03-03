package com.viarzilin.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyNumberProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendMyNumberDto(String myNumber) {
        kafkaTemplate.send("myNumber", myNumber);
    }
}
