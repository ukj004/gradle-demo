package com.ujjwal.gradledemo.service;

import com.ujjwal.gradledemo.entity.OrderResponse;
import reactor.core.publisher.Flux;

public interface OrderDetailsService {

    Flux<OrderResponse> getOrderDetails();
}
