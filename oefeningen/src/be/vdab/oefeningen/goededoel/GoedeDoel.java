package be.vdab.oefeningen.goededoel;

import java.math.BigDecimal;

public class GoedeDoel {

    // region Fields (member variables)
    private BigDecimal bedrag = BigDecimal.ZERO;
    private String naam = "";
    private BigDecimal totaal = BigDecimal.ZERO;
    // endregion


    // region Constructor(s)
    public GoedeDoel() {
    }

    public GoedeDoel(BigDecimal bedrag, String naam) {
        setBedrag(bedrag);
        setNaam(naam);
    }
    // endregion


    // region Getters & Setters
    public BigDecimal getBedrag() {
        return bedrag;
    }

    public void setBedrag(BigDecimal bedrag) {
        if (bedrag != null)  {
            this.bedrag = bedrag;
            setTotaal(bedrag);
        }
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }

    private BigDecimal getTotaal() {
        return totaal;
    }

    private void setTotaal(BigDecimal totaal) {
        if (totaal != null) {
            this.totaal = this.totaal.add(totaal);//+= totaal;
        }
    }
    // endregion


    // region Methods - Public
    public void stortenGeld(BigDecimal bedrag, String naam) {
        setBedrag(bedrag);
        setNaam(naam);
    }

    public String getTotaalString() {
        return String.valueOf(totaal); //12.4.3 Convert a primitive type to String
    }
    // endregion




}
