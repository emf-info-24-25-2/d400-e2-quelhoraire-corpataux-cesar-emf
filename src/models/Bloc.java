package models;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Bloc {
    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom, ModuleInfo[] modules) {
        this.nom = nom;
        this.modules = modules;
        modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];
        // il faut parcourir le tableau et atribuer dans les 4 premières cellules la
        // valeurs MATU
        for (int i = 0; i < 4; i++) {
            modules[i] = "MATU";
        }
    }

    public String getNom() {
        return nom;
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean estPlanifier = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                for (int j = 0; j < modules.length; j++) {
                    int count = 0;
                    if (count < 3) {
                        if (modules[j] != null) {
                            modules[j] = module;
                            count++;
                        }
                        estPlanifier = true;
                    }

                }
            }
        }
        return estPlanifier;

    }

    public void afficherHoraire() {
        for (int i = 0; i < modules.length; i++) {
            System.out.println(DayOfWeek.values()[i].getDisplayName(TextStyle.FULL, Locale.FRANCE));
        }
    }

    public boolean estTotalementPlanifie() {
        boolean EstTotalementPlanifie = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                EstTotalementPlanifie = true;
            } else {
                EstTotalementPlanifie = false;
            }
        }

        return EstTotalementPlanifie;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean contient = false;
        for (int i = 0; i < modules.length; i++) {
            if (module != modules[i]) {
                contient = false;
            }else{
                contient = true;
            }
        }

        return contient;
    }

    @Override
    public String toString() {
        return "Le Bloc s'appelle : " + nom;
    }

}
