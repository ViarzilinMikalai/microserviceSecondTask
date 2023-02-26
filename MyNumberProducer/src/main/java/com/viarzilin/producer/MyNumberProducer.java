package com.viarzilin.producer;

import com.viarzilin.dto.MyNumberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyNumberProducer {
    private final KafkaTemplate<String, MyNumberDto> kafkaTemplate;
    public void sendMyNumberDto(MyNumberDto myNumberDto) {
        kafkaTemplate.send("myNumber", myNumberDto);
    }
}
