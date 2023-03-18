package com.viarzilin.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.viarzilin.domain.MyNumber;
import com.viarzilin.service.MyNumberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class MyNumberConsumer {
    private final MyNumberService service;

    @KafkaListener(topics = "myNumber", groupId = "1")
    public void consumeMyNumber(String number) {
        ObjectMapper mapper = new ObjectMapper();
        MyNumber num = null;
        try {
            num = mapper.readValue(number, MyNumber.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        log.info(num.toString());
        service.saveMyNumber(num);
    }
}
