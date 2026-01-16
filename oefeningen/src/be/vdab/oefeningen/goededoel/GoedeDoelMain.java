package be.vdab.oefeningen.goededoel;

import java.math.BigDecimal;

public class
GoedeDoelMain  {
    void main() {
        // Oefening: GoedeDoel
        String doelNaam = IO.readln("Doel naam: ");
        String bedrag = IO.readln("Typt een bedrag, of nul om te stoppen: ");
        //IO.println(bedrag);

        GoedeDoel goedeDoel1 = new GoedeDoel();
        vraagBedragen(doelNaam, bedrag, goedeDoel1);

        IO.println("Doel naam: " + goedeDoel1.getNaam());
        IO.println("Totaal: " + goedeDoel1.getTotaalString());
    }

    public void vraagBedragen( String doelNaam, String bedrag, GoedeDoel goedeDoel) {
        while (!bedrag.equals("0") && !bedrag.equals("nul")) {
            BigDecimal bigDecBedrag = new BigDecimal(bedrag);

            goedeDoel.stortenGeld(bigDecBedrag, doelNaam);

            bedrag = IO.readln("Typt een bedrag, of nul om te stoppen: ");
        }

        //IO.println(goedeDoel.getTotaalString());
    }


}
