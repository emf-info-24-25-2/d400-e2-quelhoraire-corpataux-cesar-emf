package models;

public class Professeur {
    public static boolean enseigneCeModule;
    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    public boolean enseigneCeModule(String nomDuModule){
        boolean enseigneCeModule = false;

        return enseigneCeModule;
    }

    public void ajouterModuleEnseigne(int nbreRandom){

    }

    public void viderModules(){
        
    }

    @Override
    public String toString() {
        return "Professeur [nom=" + nom + ", prenom=" + prenom + "]";
    }

    
}
