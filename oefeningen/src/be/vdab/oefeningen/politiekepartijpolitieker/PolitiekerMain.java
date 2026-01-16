package be.vdab.oefeningen.politiekepartijpolitieker;

public class PolitiekerMain {
     void main() {

         // Oefening: PolitiekePartij - Politieker
         PolitiekePartij politiekePartij1 = new PolitiekePartij("Een politieke partij", 2);
         Politieker politieker1 = new Politieker("John", "Doe", politiekePartij1);

         IO.println("OEFENING: PolitiekePartij - Politieker");
         IO.println(politieker1);
    }


}
