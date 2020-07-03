package com.pokemon.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pokemon_entrenador")
public class PokemonEntrenador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPokemon;
	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_pokedex", referencedColumnName = "id_pokedex")
	private Pokedex pokedex;	
	@Column(name="alias")
	private String alias;
	@Column(name="entrenador")
	private String entrenador;
	@Column(name="shiny")
	private boolean shiny;
	@Column(name="nature")
	private String nature;
	
	public Long getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(Long idPokemon) {
		this.idPokemon = idPokemon;
	}
	
	public Pokedex getPokedex() {
		return pokedex;
	}
	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public boolean isShiny() {
		return shiny;
	}
	public void setShiny(boolean shiny) {
		this.shiny = shiny;
	}
	public String getSature() {
		return nature;
	}
	public void setSature(String sature) {
		this.nature = sature;
	}
	
}
