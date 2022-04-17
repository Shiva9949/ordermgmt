package com.shiva.order.restcall.body;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
	
	private Integer id;
	private String productName;
	private String units;
	private Long price;
	
}
