package com.pokemon.response;

import java.io.Serializable;

public class PkmnResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5310875303072126264L;
	private String alias;
	private String nature;
	private boolean shiny;
	private String entrenador;
	private Pokedex idPokedex;
	private Long idPokemon;

	
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public boolean isShiny() {
		return shiny;
	}
	public void setShiny(boolean shiny) {
		this.shiny = shiny;
	}
	public Pokedex getIdPokedex() {
		return idPokedex;
	}
	public void setIdPokedex(Pokedex idPokedex) {
		this.idPokedex = idPokedex;
	}
	public Long getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(Long idPokemon) {
		this.idPokemon = idPokemon;
	}
	
	
}
