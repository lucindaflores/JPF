package be.vdab.oefeningen.breuk;

public class BreukMain {
     void main() {

         try {
             String teller = IO.readln("Typt de teller: ");
             String noemer = IO.readln("Typt de noemer: ");

             Breuk breuk1 = new Breuk(Integer.parseInt(teller), Integer.parseInt(noemer));

             IO.println(breuk1);

         } catch (IllegalArgumentException e) {
             IO.println("ERROR: " + e.getMessage());
         }

    }
}
