package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Models.TestModel;

@Service
public class TestService {
    public String functionTest(TestModel ts){
        return ts.functionHello();
    }
}
