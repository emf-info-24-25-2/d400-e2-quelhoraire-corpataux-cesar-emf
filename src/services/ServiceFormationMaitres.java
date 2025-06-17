package services;
import application.App;
import models.*;


public class ServiceFormationMaitres {

    public static final void attribuerModules(Professeur[] professeur, ModuleInfo[] modules) {

        while (!tousModulesCouverts(null, null)) {
            int nbreRandom = (int) (Math.random() * (App.NOMS_MODULES.length - 0 + 1)) + 0;
            if (Professeur.getModulesEnseignes = false) {
                Professeur.ajouterModuleEnseigne(nbreRandom);
            }
        }
    }

    public static final boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        boolean tousModulesCouverts = false;
        

        return tousModulesCouverts;
    }
}
