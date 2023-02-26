package com.viarzilin.controller;

import com.viarzilin.producer.MyNumberProducer;
import com.viarzilin.dto.MyNumberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/number")
public class MyNumberController {
    private final MyNumberProducer producer;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MyNumberDto addNumber(@RequestBody MyNumberDto number) {
        log.info(number.toString());
        producer.sendMyNumberDto(number);
        return number;
    }
}
