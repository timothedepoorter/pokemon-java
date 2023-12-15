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

    /**
     * verifie si le pokemon et en vie en verrifiant le nombre de point de vie
     * renvois true si il est en vie et false si il est mort
     * @return Boolean
     */
    public boolean estEnVie(){
        if(this.pointVie > 0){
            return true;
        }
        return false;
    }
}
