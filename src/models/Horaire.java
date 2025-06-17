package models;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    private Bloc[] blocs;

    public Horaire(Bloc[] blocs) {
        this.blocs = blocs;
    }


    public boolean planifierModuleInfo(ModuleInfo[] modules, Professeur[] profs) {
        boolean estPlanifier = true;
        return estPlanifier;
    }

    public void afficherHoraire() {
        for (int i = 0; i < blocs.length; i++) {
            System.out.println(i);
        }
    }

    public Bloc moduleDansQueBloc(ModuleInfo module) {

    }

}
