package com.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.request.PkmnRequest;
import com.pokemon.request.PokemonsToUpdateResquest;
import com.pokemon.response.PkmnResponse;
import com.pokemon.response.Response;
import com.pokemon.service.CentralService;



@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

	@Autowired
	private CentralService central; 
	
	
	@GetMapping("/{entrenador}")
	public List<PkmnResponse> pokemonEntrenador(@PathVariable(value="entrenador") String entrenador){
		return central.vertodosPkmnEntrenador(entrenador);
				
				
	}
	@PostMapping
	public Response insertPokemon(@RequestBody PkmnRequest request ) {
		return central.insertarPokemonEntrenador(request);
	}
	
	@DeleteMapping("/{pkmId}")
	public Response deletePokemon(@PathVariable(value="pkmId") Long pkmId) {
		return central.borrarPkm(pkmId);
	}
	
	@PutMapping("/{idPkm}")
	public Response updatePokemon(@RequestBody PkmnRequest request,@PathVariable(value="idPkm") Long idPkm) {
		return central.actualizarPkm(request,idPkm);
	}
	
	@PutMapping
	public Response updateListPokemon(@RequestBody PokemonsToUpdateResquest lista) {
		return central.actualizarTodos(lista);
	}
	
}
