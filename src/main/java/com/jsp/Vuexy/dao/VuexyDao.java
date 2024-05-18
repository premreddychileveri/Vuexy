package com.jsp.Vuexy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Vuexy.dto.Vuexy;
import com.jsp.Vuexy.repo.VuexyRepo;

@Repository
public class VuexyDao {
	@Autowired
	private VuexyRepo repo;
	
	public Vuexy save(Vuexy vuexy) {
		return repo.save(vuexy);
	}

	public List<Vuexy> fetchAll() {
		return repo.findAll();
		
	}

}
