package fr.pokemon.pokemon;
import fr.pokemon.attaque.normal.Griffe;
import fr.pokemon.outilCombat.OutilCombat;
import fr.pokemon.type.Type;

import fr.pokemon.attaque.eau.PistoletAEau;

public class Aquali extends Pokemon implements Griffe, PistoletAEau {

    public Aquali(String nom, Type typePokemon, int pointVie) {
        super(nom, typePokemon, pointVie);
    }

    /**
     * * Soustrait les points de vie du pokemon attaqué en fonction de son type
     * * (l'attaque fera plus de dégâts si le type adverse est feu, à l'inverse,
     * * elle fera moins de dégât si le type adverse est feuille).
     * @param degatMax - Dégât maximum de l'attaque
     * @param degatMin - Dégây minimum de l'attaque
     * @param pokemon - pokemon attaquant
     */
    @Override
    public void griffe(int degatMin, int degatMax, Pokemon pokemon) {
        OutilCombat.outilCambat(degatMax,degatMin,this,pokemon);
    }


    /**
     * * Soustrait les points de vie du pokemon attaqué en fonction de son type
     * * (l'attaque fera plus de dégâts si le type adverse est feu, à l'inverse,
     * * elle fera moins de dégât si le type adverse est feuille).
     * @param degatMax - Dégât maximum de l'attaque
     * @param degatMin - Dégây minimum de l'attaque
     * @param pokemon - pokemon attaquant
     */
    @Override
    public void pistoletAEau(int degatMin, int degatMax, Pokemon pokemon) {
        OutilCombat.outilCambat(degatMax,degatMin,this,pokemon);
    }
}
