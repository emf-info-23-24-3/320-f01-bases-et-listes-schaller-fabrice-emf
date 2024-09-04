package app;

import java.util.ArrayList;

import models.Personne;

public class Application {

    public static void main(String[] args) {
        // Création de la collection intelligente
        ArrayList<Personne> personnes = new ArrayList<>();

        // Ajout des personnes
        personnes.add(new Personne("SCHALLER", "Fabrice", "Tannenweg 12", "Tentlingen", 1734));
        personnes.add(new Personne("VON BETZENSTEIN", "Garry", "TGrossverdienerstrasse 1", "Moneyhausen", 1111));
        personnes.add(new Personne("STARK", "Tony", "Testgasse 5", "Miami", 1234));

        // Affichage du nom de chaque personne
        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }
    }

}
