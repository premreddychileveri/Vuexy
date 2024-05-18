package com.jsp.Vuexy.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Vuexy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Integer end_year;
	private Float city_lng;
	private Float city_lat;
	private Integer intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private Integer start_year;
	private Integer impact;
	private String city;
	private String country;
	private Integer relevance;
	private String pestle;
	private String source;
	private String title;
	private Integer likelihood;
}
