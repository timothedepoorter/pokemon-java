package fr.pokemon.pokemon;
import fr.pokemon.attaque.normal.Griffe;
import fr.pokemon.type.Type;

import fr.pokemon.attaque.eau.PistoletAEau;

public class Aquali extends Pokemon implements Griffe, PistoletAEau {

    public Aquali(String nom, Type typePokemon, int pointVie) {
        super(nom, typePokemon, pointVie);
    }

    /**
     * Soustrait les points de vie du pokemon attaqué en fonction de son type
     * (l'attaque fera plus de dégâts si le type adverse est feu, à l'inverse,
     * elle fera moins de dégât si le type adverse est feuille).
     * @param degatMin int - dégât minimum de l'attaque
     * @param degatMax int - dégât maximum de l'attaque
     * @param pokemon Pokemon - pokémon attaqué
     */
    @Override
    public void griffe(int degatMin, int degatMax, Pokemon pokemon) {
        if (pokemon.typePokemon.getNomType().equals(this.typePokemon.getForceContre())) {
            pokemon.setPointVie(degatMax);
        } else if (pokemon.typePokemon.getNomType().equals(this.typePokemon.getFaibleContre())) {
            pokemon.setPointVie(degatMin);
        } else {
            pokemon.setPointVie((degatMin+degatMax) / 2);
        }
    }
    @Override
    public void pistoletAEau(int degatMin, int degatMax, Pokemon pokemon) {

    }
}
