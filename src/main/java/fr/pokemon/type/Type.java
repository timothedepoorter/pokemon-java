package fr.pokemon.type;

public class Type {
    private String nomType;
    private String forceContre;
    private String faibleContre;

    public Type(String nomType, String forceContre, String faibleContre) {
        this.nomType = nomType;
        this.forceContre = forceContre;
        this.faibleContre = faibleContre;
    }

    public String getNomType() {
        return nomType;
    }

    public String getForceContre() {
        return forceContre;
    }

    public String getFaibleContre() {
        return faibleContre;
    }
}
