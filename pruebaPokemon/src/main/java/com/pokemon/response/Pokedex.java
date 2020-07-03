package com.pokemon.response;

import java.io.Serializable;

public class Pokedex implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3842296290902851682L;
	private Long id_pokedex;
	private String nombre;
	private String imagen;
	public Long getId_pokedex() {
		return id_pokedex;
	}
	public void setId_pokedex(Long id_pokedex) {
		this.id_pokedex = id_pokedex;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
}
