package be.vdab.oefeningen.persoon;

public class Persoon {

    // region Fields (Member variables)
    private String voornaam;
    private String familienaam;
    // endregion

    // region Constructor(s)
    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }
    // endregion

    // region Getters & Setters
    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }
    // endregion

    // region Methods - Public
    public String getVolledigeNaam() {
        return getVoornaam() + " " + getFamilienaam();
    }
    // endregion


}
