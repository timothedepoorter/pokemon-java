package fr.pokemon.outilCombat;

import fr.pokemon.pokemon.Aquali;
import fr.pokemon.pokemon.Pokemon;

public class OutilCombat {

    /**
     * * Soustrait les points de vie du pokemon attaqué en fonction de son type
     * * (l'attaque fera plus de dégâts si le type adverse est feu, à l'inverse,
     * * elle fera moins de dégât si le type adverse est feuille).
     * @param degatMax - Dégât maximum de l'attaque
     * @param degatMin - Dégây minimum de l'attaque
     * @param pokemon1 - pokemon attaquant
     * @param pokemon2 - pokemon attaqué
     */
    public static void outilCambat(int degatMax, int degatMin, Pokemon pokemon1, Pokemon pokemon2) {
        if (pokemon2.getTypePokemon().getNomType().equals(pokemon1.getTypePokemon().getForceContre())) {
            pokemon2.setPointVie(degatMax);
        } else if (pokemon2.getTypePokemon().getNomType().equals(pokemon1.getTypePokemon().getFaibleContre())) {
            pokemon2.setPointVie(degatMin);
        } else {
            pokemon2.setPointVie((degatMin+degatMax) / 2);
        }
    }

}
