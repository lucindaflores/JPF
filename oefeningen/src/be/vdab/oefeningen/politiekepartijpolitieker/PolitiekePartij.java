package be.vdab.oefeningen.politiekepartijpolitieker;

public class PolitiekePartij {

    // region Fields (member variables)
    private String naam;
    private int aantalLeden;
    // endregion


    // region Constructor(s)
    public PolitiekePartij(String naam, int aantalLeden) {
        setNaam(naam);
        setAantalLeden(aantalLeden);
    }
    // endregion


    // region Getters & Setters
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null && !naam.isBlank()) {
            this.naam = naam;
        }
    }

    public int getAantalLeden() {
        return aantalLeden;
    }

    public  void setAantalLeden(int aantalLeden) {
        if (aantalLeden > 0) {
            this.aantalLeden = aantalLeden;
        }
    }
    // endregion


}
