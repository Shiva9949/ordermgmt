package com.shiva.order.restcall.body;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class ProductResponseData {
	
	
	private List<ProductResponse> response;

}
