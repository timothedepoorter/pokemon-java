package fr.pokemon.pokemon;

public abstract class Pokemon {
    protected String nom;
    protected String typePokemon; //Changer le type
    protected int pointVie;


    public Pokemon(String nom, String typePokemon, int pointVie) {
        this.nom = nom;
        this.typePokemon = typePokemon;
        this.pointVie = pointVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypePokemon() {
        return typePokemon;
    }

    public void setTypePokemon(String typePokemon) {
        this.typePokemon = typePokemon;
    }

    public int getPointVie() {
        return pointVie;
    }

    public void setPointVie(int pointVie) {
        this.pointVie = pointVie;
    }
}
