package Projet1.Calculus;

public abstract class Conjonction extends Affirmation {
    protected Affirmation affirmation1;
    protected Affirmation affirmation2;

    public Conjonction(Affirmation affirmation1, Affirmation affirmation2) {
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }
}

