package com.shiva.order.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.order.restcall.ProductRestCalls;
import com.shiva.order.restcall.body.Main;
import com.shiva.order.restcall.body.ProductResponse;
import com.shiva.order.restcall.body.WeatherResponceData;

import ch.qos.logback.classic.Logger;

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
	
	@GetMapping("/products/{id}")
	public ProductResponse getProd(@PathVariable("id") Integer id) {
	ProductResponse p =	productRestCalls.getProductById(id);
		return p;
}
	@GetMapping("/products/name/{productName}")
	public List<ProductResponse> getProductListByName(@PathVariable("productName")String productName) {
		 List<ProductResponse> a =   productRestCalls.getProductByProductName(productName);
		return a;
	}
	@GetMapping("/products/weather")
	
	public ResponseEntity<String> getWeatherdata(@RequestParam String q,@RequestParam String appid) {
		Main a = productRestCalls.getTemperature(q, appid);
		int b= (int) (a.getTemp()-273);
		return new ResponseEntity<String>("The Current Temperature of the City "+q+"  is "+b+"C",HttpStatus.OK);
		
	}
}
