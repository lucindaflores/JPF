package be.vdab.oefeningen.palindroom;

public class Palindroom {

    static void main() {

        String woord = IO.readln("Typt een woord: ");

        final Boolean isEenPalindroom = controleerPalindroom(woord);

        // Resultaat printen
        if (isEenPalindroom) {
            IO.println("Het woord " + woord + " is een palindroom.");
        }  else {
            IO.println("Het woord " + woord + " is geen palindroom!.");
        }
    }


    private static Boolean controleerPalindroom(String woord) {
        boolean isEenPalindroom = false;

        int length = woord.length();
        woord = woord.toLowerCase();

        StringBuilder woordSb = new StringBuilder(woord);
        StringBuilder woordOmgekeerdSb =  new StringBuilder(woord);
        woordOmgekeerdSb.reverse();

        // Test prints
        //IO.println(length);
        //IO.println("WORD: " + woordSb.toString());
        //IO.println("WORD REVERSED: " + woordOmgekeerdSb.toString());


        // Controleer of het woord een palindroom is
        for (int i = 0; i < length; i++) {
            isEenPalindroom = woordSb.charAt(i) == woordOmgekeerdSb.charAt(i);
        }

        return isEenPalindroom;
    }


}