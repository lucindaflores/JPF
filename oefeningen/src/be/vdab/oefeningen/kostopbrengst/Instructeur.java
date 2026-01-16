package be.vdab.oefeningen.kostopbrengst;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst {

    // region Fields (member variables)
    private BigDecimal maandwedde = BigDecimal.ZERO; // Monthly salary
    private BigDecimal uurPrijsPerLes = BigDecimal.ZERO;
    private BigDecimal aantalUrenLesAanWerknemers = BigDecimal.ZERO;
    // endregion


    // region Constructor(s)
    public Instructeur() {
        setMaandwedde(maandwedde);
        setUurPrijsPerLes(uurPrijsPerLes);
        setAantalUrenLesAanWerknemers(aantalUrenLesAanWerknemers);
    }

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerLes, BigDecimal aantalUrenLesAanWerknemers) {
        setMaandwedde(maandwedde);
        setUurPrijsPerLes(uurPrijsPerLes);
        setAantalUrenLesAanWerknemers(aantalUrenLesAanWerknemers);
    }
    // endregion


    // region Getters & Setters
    public BigDecimal getMaandwedde() {
        return maandwedde;
    }

    public void setMaandwedde(BigDecimal maandwedde) {
        if (maandwedde != null) {
            this.maandwedde = maandwedde;
        }
    }

    public BigDecimal getUurPrijsPerLes() {
        return uurPrijsPerLes;
    }

    public void setUurPrijsPerLes(BigDecimal uurPrijsPerLes) {
        if (uurPrijsPerLes != null ) {
            this.uurPrijsPerLes = uurPrijsPerLes;
        };
    }

    public BigDecimal getAantalUrenLesAanWerknemers() {
        return aantalUrenLesAanWerknemers;
    }

    public void setAantalUrenLesAanWerknemers(BigDecimal aantalUrenLesAanWerknemers) {
        if (aantalUrenLesAanWerknemers != null) {
            this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
        }
    }
    // endregion


    // region Methods - Implementation
    @Override
    public BigDecimal getKost() {
        return getMaandwedde();
    }

    @Override
    public BigDecimal getOpbrengst() {
        return getUurPrijsPerLes().multiply(getAantalUrenLesAanWerknemers());
    }
    // endregion

    // region Methods - Public
    // (show, calculate, process, execute, etc.)
    // endregion


}
