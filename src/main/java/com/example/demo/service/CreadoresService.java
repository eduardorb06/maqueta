package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Creadores;
import com.example.demo.repository.CreadoresRepository;

@Service
public class CreadoresService implements edu{
@Autowired
private CreadoresRepository repo;
@Override
public List<Creadores>findAll(){
	return repo.findAll();
}
@Override
public Creadores save(Creadores sa) {
	return repo.save(sa);	
}
@Override
public Creadores get(Integer id) {
	return repo.findById(id).get();
}
@Override
public void delete(Integer id) {
	repo.deleteById(id);
}
@Override
public void Update(Creadores sav) {
	repo.save(sav);
}
}
