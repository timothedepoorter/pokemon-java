package fr.pokemon.pokemon;
import fr.pokemon.type.Type;

import fr.pokemon.attaque.feu.LanceFlammes;

public class Pyroli extends Pokemon implements LanceFlammes {
    public Pyroli(String nom, Type typePokemon, int pointVie) {
        super(nom, typePokemon, pointVie);
    }

    @Override
    public void lanceFlammes(int degatMin, int degatMax, Pokemon pokemon) {

    }
}
