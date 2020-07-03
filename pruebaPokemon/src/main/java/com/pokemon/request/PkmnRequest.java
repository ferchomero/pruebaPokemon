package com.pokemon.request;

import java.io.Serializable;

public class PkmnRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7606657820685633237L;
	private Long id_pokedex;
	private String alias;
	private String nature;
	private boolean shiny;
	private String entrenador;
	private Long idPokemon;

	public Long getId_pokedex() {
		return id_pokedex;
	}

	public void setId_pokedex(Long id_pokedex) {
		this.id_pokedex = id_pokedex;
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

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public Long getIdPokemon() {
		return idPokemon;
	}

	public void setIdPokemon(Long idPokemon) {
		this.idPokemon = idPokemon;
	}
	
}
