package com.practica.crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductDTO {

	@Id
	private String _id;
	private String nombre;
	private Double precio;
	private LocalDate expiry_date;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public LocalDate getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}
	
}
