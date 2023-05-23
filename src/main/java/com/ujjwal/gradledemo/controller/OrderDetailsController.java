package com.ujjwal.gradledemo.controller;

import com.ujjwal.gradledemo.entity.OrderResponse;
import com.ujjwal.gradledemo.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.math.BigInteger;

@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/getOrderDetails")
    @ResponseStatus(HttpStatus.OK)
    public Flux<OrderResponse> getOrderDetails() {
        return orderDetailsService.getOrderDetails();
        }
}
