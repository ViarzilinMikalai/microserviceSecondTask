package com.viarzilin.controller;

import com.viarzilin.producer.MyNumberProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/number")
public class MyNumberController {
    private final MyNumberProducer producer;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addNumber(@RequestBody String number) {
        producer.sendMyNumberDto(number);
        return number;
    }
}
