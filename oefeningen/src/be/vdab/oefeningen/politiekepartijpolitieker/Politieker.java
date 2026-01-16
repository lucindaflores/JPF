package be.vdab.oefeningen.politiekepartijpolitieker;

import be.vdab.oefeningen.persoon.Persoon;

public class Politieker extends Persoon {

    // region Fields (member variables)
    private PolitiekePartij politiekePartij;
    // endregion


    // region Constructor(s)
    public Politieker(String voornaam, String familienaam, PolitiekePartij politiekePartij) {
        super(voornaam, familienaam);
        this.politiekePartij = politiekePartij;
    }
    // endregion


    // region Getters & Setters
    public PolitiekePartij getPolitiekePartij() {
        return politiekePartij;
    }

    public void setPolitiekePartij(PolitiekePartij politiekePartij) {
        this.politiekePartij = politiekePartij;
    }
    // endregion


    // region Methods - Public
    @Override
    public String toString() {
        return "Volledige naam: " + getVoornaam() + " " + getFamilienaam() + ".\n" +
                "Politieke partij: " + politiekePartij.getNaam() + ".\n" +
                "Aantal leden: " + politiekePartij.getAantalLeden();
    }
    // endregion


    // region Methods - Overrides
    // endregion

}
