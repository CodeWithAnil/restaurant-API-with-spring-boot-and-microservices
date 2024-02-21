package com.example.orderservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {
      
	private final OrderService orderService;
	
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public String placeOrder(@RequestBody OrderRequest orderReuest) {
		
    	orderService.placeOrder(orderReuest);
    	return "Order Placed SuccessFully";
	}
}
