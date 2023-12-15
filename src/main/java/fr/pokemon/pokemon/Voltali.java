package fr.pokemon.pokemon;

import fr.pokemon.attaque.electrique.FatalFoudre;

public class Voltali extends Pokemon implements FatalFoudre {
    public Voltali(String nom, String typePokemon, int pointVie) {
        super(nom, typePokemon, pointVie);
    }

    @Override
    public void fatalFoudre(int degatMin, int degatMax, Pokemon pokemon) {

    }
}
