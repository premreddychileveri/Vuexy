package com.jsp.Vuexy.controller;

import java.util.List;

import javax.lang.model.util.Elements.Origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Vuexy.dto.Vuexy;
import com.jsp.Vuexy.service.VuexyService;
import com.jsp.Vuexy.util.ResponseStructure;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.PUT, RequestMethod.DELETE})
public class VuexyController {
	@Autowired
	private VuexyService service;
	@PostMapping("/save")
	private ResponseEntity<ResponseStructure<Vuexy>> save(@RequestBody Vuexy vuexy){
		return service.saveVuexy(vuexy);
	}
	@GetMapping("/fetchall")
	public ResponseEntity<ResponseStructure<List<Vuexy>>> fetchAll(){
		return service.fetchAll();
	}
	
	

}
