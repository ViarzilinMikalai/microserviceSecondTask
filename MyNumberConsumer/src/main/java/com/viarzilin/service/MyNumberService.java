package com.viarzilin.service;

import com.viarzilin.domain.MyNumber;
import com.viarzilin.repo.MyNumberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyNumberService {
    private final MyNumberRepo repo;

    public MyNumber saveMyNumber(MyNumber number) {

        return repo.save(number);
    }
}
