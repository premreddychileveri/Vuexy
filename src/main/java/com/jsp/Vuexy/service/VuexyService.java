package com.jsp.Vuexy.service;

import java.rmi.StubNotFoundException;
import java.sql.Struct;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.jsp.Vuexy.dao.VuexyDao;
import com.jsp.Vuexy.dto.Vuexy;
import com.jsp.Vuexy.util.ResponseStructure;

@Service
public class VuexyService {
	@Autowired
	private VuexyDao dao;

	public ResponseEntity<ResponseStructure<Vuexy>> saveVuexy(Vuexy vuexy) {
		Vuexy dbvuexy = dao.save(vuexy);
		ResponseStructure<Vuexy> structure = new ResponseStructure<Vuexy>();
		structure.setData(dbvuexy);
		structure.setStatus(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<Vuexy>>(structure, HttpStatus.ACCEPTED);
	}

	public ResponseEntity<ResponseStructure<List<Vuexy>>> fetchAll() {
		List<Vuexy> list = dao.fetchAll();
		ResponseStructure<List<Vuexy>> structure = new ResponseStructure<List<Vuexy>>();
		structure.setData(list);
		structure.setMessage("All data");
		structure.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<ResponseStructure<List<Vuexy>>>(structure,HttpStatus.FOUND);
	}

}
