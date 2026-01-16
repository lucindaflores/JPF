package be.vdab.oefeningen.breuk;

public class Breuk {

    // region Fields (member variables)
    private int teller;
    private int noemer; //denominator
    // endregion

    // region Constructor(s)
    public Breuk(int teller, int noemer) {
        setTeller(teller);
        setNoemer(noemer);
    }
    // endregion


    // region Getters & Setters
    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        if (noemer != 0) {
            this.noemer = noemer;
        } else {
            throw new IllegalArgumentException("De noemer mag niet nul zijn!");
        }

    }
    // endregion



    // region Methods - Overrides
    @Override
    public String toString() {
        return  teller + " / " + noemer;
    }

    // endregion

}
