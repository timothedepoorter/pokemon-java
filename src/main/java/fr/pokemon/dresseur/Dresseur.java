package fr.pokemon.dresseur;

public class Dresseur {

    private String nom;
    private String pokeball; //Changer type

    public Dresseur(String nom, String pokeball) {
        this.nom = nom;
        this.pokeball = pokeball;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPokeball() {
        return pokeball;
    }

    public void setPokeball(String pokeball) {
        this.pokeball = pokeball;
    }
}
