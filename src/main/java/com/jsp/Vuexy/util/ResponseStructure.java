package com.jsp.Vuexy.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	private T data;
	private String message;
	private int status;

}
