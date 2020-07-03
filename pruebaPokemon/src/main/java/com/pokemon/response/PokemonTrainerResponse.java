package com.pokemon.response;

import java.util.List;

public class PokemonTrainerResponse extends Response{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1649860077574902574L;
	private List<PkmnResponse> pokemons;

	public List<PkmnResponse> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<PkmnResponse> pokemons) {
		this.pokemons = pokemons;
	}
}
