package com.shiva.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.order.restcall.ProductRestCalls;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private ProductRestCalls productRestCalls;
	
	@GetMapping("/products")
	public String getProdList() {
		productRestCalls.getProductList();
		return "SUCCESS";
	}

}
