package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Entrenador;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, String>{

	
}
