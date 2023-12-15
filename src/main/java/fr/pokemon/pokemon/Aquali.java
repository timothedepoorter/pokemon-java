package fr.pokemon.pokemon;

import fr.pokemon.attaque.eau.PistoletAEau;

public class Aquali extends Pokemon implements PistoletAEau {

    public Aquali(String nom, String typePokemon, int pointVie) {
        super(nom, typePokemon, pointVie);
    }

    @Override
    public void pistoletAEau(int degatMin, int degatMax, Pokemon pokemon) {

    }
}
