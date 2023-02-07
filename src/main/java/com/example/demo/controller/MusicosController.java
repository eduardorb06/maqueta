package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Creadores;
import com.example.demo.service.CreadoresService;

@CrossOrigin
@Controller
@RestController
@RequestMapping("/jasmin")
public class MusicosController {
@Autowired
private CreadoresService crea;

@GetMapping("/all")
public ResponseEntity<List<Creadores>>findAll(){
	return new ResponseEntity<>(crea.findAll(),HttpStatus.OK);
}
@PostMapping("/save")
public ResponseEntity<Creadores>save(@RequestBody Creadores creado){
return new ResponseEntity<>(crea.save(creado),HttpStatus.CREATED);
}
@PutMapping("/books")
public ResponseEntity<Creadores>update(@RequestBody Creadores creatu){
crea.Update(creatu);
return new ResponseEntity<>(HttpStatus.OK);
}
@DeleteMapping("/{id}")
public ResponseEntity<Creadores>delete(@PathVariable Integer id){
crea.delete(id);
return new ResponseEntity<>(HttpStatus.OK);
}
@GetMapping("/{id}")
public ResponseEntity<Creadores>findById(@PathVariable Integer id){
	return new ResponseEntity<>(crea.get(id),HttpStatus.OK);
}
}
