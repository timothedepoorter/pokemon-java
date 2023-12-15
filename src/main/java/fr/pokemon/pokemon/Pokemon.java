package fr.pokemon.pokemon;

import fr.pokemon.type.Type;

public abstract class Pokemon {
    protected String nom;
    protected Type typePokemon; //Changer le type
    protected int pointVie;


    public Pokemon(String nom, Type typePokemon, int pointVie) {
        this.nom = nom;
        this.typePokemon = typePokemon;
        this.pointVie = pointVie;
    }

    public String getNom() {
        return nom;
    }

    public Type getTypePokemon() {
        return typePokemon;
    }


    public int getPointVie() {
        return pointVie;
    }

    public void setPointVie(int pointVie) {
        this.pointVie = pointVie;
    }
}
