package fr.pokemon.pokeball;

import fr.pokemon.pokemon.Pokemon;

public class Pokeball {
    private String nom;
    private Pokemon pokemon;

    public Pokeball(String nom, Pokemon pokemon) {
        this.nom = nom;
        this.pokemon = pokemon;
    }

    public String getNom() {
        return nom;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }


}
