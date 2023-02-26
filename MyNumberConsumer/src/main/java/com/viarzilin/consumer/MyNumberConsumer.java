package com.viarzilin.consumer;

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

    @KafkaListener(topics = "myNumber")
    public void consumeMyNumber(MyNumber number) {
        log.info(number.toString());
        service.saveMyNumber(number);
    }
}
