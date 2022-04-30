package com.shiva.order.restcall.body;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponceData {
	private Coord coord;
	private List<Weather> weather;
	private Main main;
	private Wind wind;
	private Clouds clouds;
	private Sys sys;
	private String base;
	private String visibilit;
	private int dt;
	private int timezone;
	private int id;
	private String name;
	private int cod;
}
