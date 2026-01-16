package be.vdab.oefeningen.kostopbrengst;

import java.math.BigDecimal;

public class Gebouw implements Kost {

    // region Constants (static final)
    // endregion

    // region Fields (member variables)
    private BigDecimal huurprijs = BigDecimal.ZERO;
    // endregion


    // region Constructor(s)
    public Gebouw() {
        setHuurprijs(huurprijs);
    }

    public Gebouw(BigDecimal huurprijs) {
        setHuurprijs(huurprijs);
    }
    // endregion


    // region Getters & Setters

    public BigDecimal getHuurprijs() {
        return huurprijs;
    }

    public void setHuurprijs(BigDecimal huurprijs) {
        if (huurprijs != null) {
            this.huurprijs = huurprijs;
        }

    }
    // endregion

    // region Methods - Abstract
    // endregion

    // region Methods - Implementation
    @Override
    public BigDecimal getKost() {
        return getHuurprijs();
    }
    // endregion

    // region Methods - Public
    // (show, calculate, process, execute, etc.)
    // endregion
}
