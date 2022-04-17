package com.shiva.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class OrderMgmtApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrderMgmtApplication.class, args);
		System.out.println("Order Mangement Application started successfully.....");
	}

}
