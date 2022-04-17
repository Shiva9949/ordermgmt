package com.shiva.order.restcall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiva.order.restcall.body.ProductResponse;
import com.shiva.order.restcall.constant.RestUrls;

@Component
public class ProductRestCalls {

	private static final Logger logger = LoggerFactory.getLogger(ProductRestCalls.class);
	
	@Autowired
	private RestTemplate restTemplate;

	public void getProductList() {
		
		logger.info("calling get Product List webservice.....");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<Object[]> resEntity = restTemplate.exchange(RestUrls.GET_ALL_PRODUCTS, HttpMethod.GET, entity, Object[].class);
	
		Object[] body = resEntity.getBody();
		ObjectMapper objMapper = new ObjectMapper();
		
		List<ProductResponse> response = Arrays.stream(body)
				  .map(object -> objMapper.convertValue(object, ProductResponse.class))
				  .collect(Collectors.toList());
		
		response.stream().forEach(data -> logger.info("{}",data));
	}


}


