package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Creadores;

public interface edu {

	List<Creadores> findAll();

	Creadores save(Creadores sa);

	Creadores get(Integer id);

	void delete(Integer id);

	void Update(Creadores sav);
}
