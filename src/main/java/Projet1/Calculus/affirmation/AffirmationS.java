package Projet1.Calculus.affirmation;

import Projet1.Calculus.Affirmation;

public abstract class AffirmationS extends Affirmation {
    private String description;
    private Boolean valeur;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Boolean getValeur() {
        return valeur;
    }
}

