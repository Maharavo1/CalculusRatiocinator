package Projet1.Calculus.affirmation;

import Projet1.Calculus.Affirmation;

public class Verite extends Affirmation {
    private String description;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Boolean getValeur() {
        return true;
    }

}
