package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Creador")
public class Creadores {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@Column(name="nombre",nullable=true,unique=false)
private String nombres;
@Column(name="apellido",nullable=true,unique=false)
private String apellidos;
@Column(name="edad",nullable=true,unique=false)
private String edad;
public Creadores() {
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getEdad() {
	return edad;
}
public void setEdad(String edad) {
	this.edad = edad;
}
}
