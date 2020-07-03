package com.pokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pokedex")
public class Pokedex {

	@Id
	@Column(name="id_pokedex")
	private Long idPokedex;
	@Column(name="nombre_pokedex")
	private String nombrePokedex;
	@Column(name="imagen_pokedex")
	private String imagenPokedex;
	
	public Pokedex(Long idPkm) {
		this.idPokedex=idPkm;
	}
	public Pokedex(Long idPkm,String img,String nom) {
		this.idPokedex=idPkm;
		this.imagenPokedex=img;
		this.nombrePokedex=nom;
	}
	public Pokedex() {
		
	}
	public Long getId_pokedex() {
		return idPokedex;
	}
	public void setId_pokedex(Long id_pokedex) {
		this.idPokedex = id_pokedex;
	}
	public String getNombre_pokedex() {
		return nombrePokedex;
	}
	public void setNombre_pokedex(String nombre_pokedex) {
		this.nombrePokedex = nombre_pokedex;
	}
	public String getImagen_pokedex() {
		return imagenPokedex;
	}
	public void setImagen_pokedex(String imagen_pokedex) {
		this.imagenPokedex = imagen_pokedex;
	}

	
	
}
