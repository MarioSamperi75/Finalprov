package se.nackademin;

/**
 * En klass for att implementera klassen Kortlek ock klassen Kort.
 */
public class KortlekMain {
    /**
     * metoden skapar ett objekt av typ Kortlek och för det anropar den två instansmetoder.
     * @param arg
     */
    public static void main(String[] arg) {


        Kortlek kl1 = new Kortlek();

        kl1.Shuffle ();

        kl1.showFirst();



    }
}