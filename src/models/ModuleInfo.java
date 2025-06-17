package models;

public class ModuleInfo {
    private String nom;
    private Professeur professeur;

    public ModuleInfo(String nom, Professeur professeur) {
        this.nom = nom;
        this.professeur = professeur;
        
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        String moduleInfo;
        if (this.professeur != null) {
            moduleInfo = nom + " avec " + professeur;
        } else {
            moduleInfo = nom;
        }

        return moduleInfo;
    }

}
