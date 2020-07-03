package com.pokemon.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entrenador")
public class Entrenador {
	@Id
	private String name;
	@Column(name = "password")
	private String password;
	@OneToMany(cascade= CascadeType.ALL,fetch = FetchType.LAZY)
	private List<PokemonEntrenador> pokemons;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<PokemonEntrenador> getPokemons() {
		return pokemons;
	}
	public void setPokemons(List<PokemonEntrenador> pokemons) {
		this.pokemons = pokemons;
	}
	
	
}
