package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L, "john", "doe", "john@javawhizz.com"),
            new Customer(2L, "mary", "public", "mary@javawhizz.com"),
            new Customer(3L, "elon", "musk","elon@javawhizz.com"),
            new Customer(4L, "dunny","duncan","dunny@javawhizz.com")
    );

    @GetMapping("/Customers")
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
}