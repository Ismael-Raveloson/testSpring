package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.TestModel;
import com.example.demo.Service.TestService;

@RestController
@RequestMapping("/Test")
public class TestController {
    
    @Autowired
    TestService serv;

    @GetMapping("/Hello")
    public String function(){
        return serv.functionTest(new TestModel());
    }


}
