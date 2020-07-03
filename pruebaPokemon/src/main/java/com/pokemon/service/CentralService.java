package com.pokemon.service;

import java.util.List;

import com.pokemon.request.PkmnRequest;
import com.pokemon.request.PokemonsToUpdateResquest;
import com.pokemon.response.PkmnResponse;
import com.pokemon.response.Response;

public interface CentralService {

	public Response insertarPokemonEntrenador(PkmnRequest request);
	public List<PkmnResponse> vertodosPkmnEntrenador(String entrenador);
	public Response borrarPkm(Long pkmn);
	public Response actualizarPkm(PkmnRequest request,Long idPkm);
	public Response actualizarTodos(PokemonsToUpdateResquest lista);
}
