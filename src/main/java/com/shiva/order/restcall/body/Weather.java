package com.shiva.order.restcall.body;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
	private int id;
	private String main;
	private String description;
	private String icon;
}
