package fr.pokemon.dresseur;

import fr.pokemon.pokeball.Pokeball;
import fr.pokemon.pokemon.Pokemon;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dresseur {

    private String nom;
    private ArrayList<Pokeball> lesPokeballs;

    public Dresseur(String nom) {
        this.nom = nom;
        this.lesPokeballs = new ArrayList<Pokeball>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Pokeball> getLesPokeballs() {
        return lesPokeballs;
    }

    /**
     * La pokeball seras ajouter a l'Arraylist lesPokeballs
     * La pokeball est ajouter si elle na pas attiend les 6 pokeball sinon renvois une expection
     * @param unePokeball
     * @throws Exception
     */
    public void ajoutPokeball(Pokeball unePokeball) throws Exception {
        if(lesPokeballs.size()>6){
           throw new Exception("Impossible nombre maximale de Pokeball attiend");
        }
        lesPokeballs.add(unePokeball);
    }


}
