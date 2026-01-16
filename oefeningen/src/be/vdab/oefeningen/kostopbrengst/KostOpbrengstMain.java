package be.vdab.oefeningen.kostopbrengst;

import java.math.BigDecimal;

public class KostOpbrengstMain {
    static void main() {

        // Objects Gebouw
        BigDecimal huurprijs1 = new BigDecimal("100.50");
        Gebouw gebouw1 = new Gebouw(huurprijs1);
        //IO.println(gebouw1.getHuurprijs());

        BigDecimal huurprijs2 = new BigDecimal("200");
        Gebouw gebouw2 = new Gebouw(huurprijs2);
        //IO.println(gebouw2.getHuurprijs());

        // Objects Instructeur
        BigDecimal wedde1 = new BigDecimal("1000");
        Instructeur instructeur1 = new Instructeur( );
        instructeur1.setMaandwedde(wedde1);
        //IO.println(instructeur1.getMaandwedde());

        // Plaats objecten in array type Kost
        var kosten = new Kost[3];
        kosten[0] = gebouw1;
        kosten[1] = gebouw2;
        kosten[2] = instructeur1;

        // Bereken de totale kost
        BigDecimal totaal = BigDecimal.ZERO;
        for (var kost : kosten) {
            IO.println("Kost: " + kost.getKost());
            totaal = totaal.add(kost.getKost());
        }

        // Totaal
        IO.println("Totale kosten: " + totaal);
    }


}
