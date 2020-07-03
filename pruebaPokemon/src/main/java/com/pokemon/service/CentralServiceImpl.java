package com.pokemon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.entity.Pokedex;
import com.pokemon.entity.PokemonEntrenador;
import com.pokemon.exception.NotFoundException;
import com.pokemon.repository.PokemonEntrenadorRepo;
import com.pokemon.request.PkmnRequest;
import com.pokemon.request.PokemonsToUpdateResquest;
import com.pokemon.response.PkmnResponse;
import com.pokemon.response.Response;

@Service
public class CentralServiceImpl implements CentralService{

	@Autowired
	private PokemonEntrenadorRepo pkmentrenadorRepo;
	
	
	public Response insertarPokemonEntrenador(PkmnRequest request) {
		Response result = new Response();
		PokemonEntrenador insertado = new PokemonEntrenador();
		insertado.setAlias(request.getAlias());
		insertado.setEntrenador(request.getEntrenador());
		insertado.setPokedex(new Pokedex(request.getId_pokedex(),"",""));
		insertado.setSature(request.getNature());
		insertado.setShiny(request.isShiny());
		pkmentrenadorRepo.save(insertado);
		result.setCodigo(200);
		result.setMensaje("Insercion exitosa");
		return result;
	}


	@Override
	public List<PkmnResponse> vertodosPkmnEntrenador(String entrenador) {
		List<PokemonEntrenador> pokemons=pkmentrenadorRepo.findByEntrenador(entrenador);
		List<PkmnResponse> result= new ArrayList<>();
		for (PokemonEntrenador pkmnDb : pokemons) {
			result.add(converter(pkmnDb));
		}
		return result;
	}
	
	private PkmnResponse converter(PokemonEntrenador pkDb) {
		PkmnResponse e = new PkmnResponse();
		e.setAlias(pkDb.getAlias());
		e.setIdPokemon(pkDb.getIdPokemon());
		e.setEntrenador(pkDb.getEntrenador());
		com.pokemon.response.Pokedex pkDx= new com.pokemon.response.Pokedex();
		pkDx.setId_pokedex(pkDb.getPokedex().getId_pokedex());
		pkDx.setImagen(pkDb.getPokedex().getImagen_pokedex());
		pkDx.setNombre(pkDb.getPokedex().getNombre_pokedex());
		e.setIdPokedex(pkDx);
		e.setNature(pkDb.getSature());
		e.setShiny(pkDb.isShiny());
		return e;
	}


	@Override
	public Response borrarPkm(Long pkmn) {		
		 pkmentrenadorRepo.deleteById(pkmn);
		 return new Response(200,"Pokemon Eliminado");
	}
	
	public Response actualizarPkm(PkmnRequest request,Long idPkm) {
		PokemonEntrenador updated =pkmentrenadorRepo.findById(idPkm).orElseThrow(()->new NotFoundException("No existe el pokemon a modificar"));
		updated.setAlias(request.getAlias());
		updated.setEntrenador(request.getEntrenador());
		updated.setSature(request.getNature());
		updated.setShiny(request.isShiny());
		pkmentrenadorRepo.save(updated);
		return new Response(200,"Pokemon Actualizado");
	}


	@Override
	public Response actualizarTodos(PokemonsToUpdateResquest lista) {
		if(lista.getListaPokemon()==null) {
			throw new NotFoundException("No existen registros para actualizar");
		}else if(lista.getListaPokemon().isEmpty()){
			throw new NotFoundException("La lista esta vacia");
		}else {
			for(PkmnRequest request: lista.getListaPokemon()) {
				actualizarPkm(request, request.getIdPokemon());
			}
		}
		return new Response(200,"Datos actualizados");
	}
	
}
