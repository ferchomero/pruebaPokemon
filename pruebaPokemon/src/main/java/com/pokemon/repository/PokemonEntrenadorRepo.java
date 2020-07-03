package com.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.entity.PokemonEntrenador;

public interface PokemonEntrenadorRepo extends JpaRepository<PokemonEntrenador, Long>{
	
	List<PokemonEntrenador> findByEntrenador(String entrenador);

}
