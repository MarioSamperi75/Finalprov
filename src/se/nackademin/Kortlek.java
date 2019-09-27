package se.nackademin;

/**En klass som tiilåter skapelsen och några enkla användningar av en simulerad kortlek
 * (french cards). Klassen har en array av objekt av typ Kort som instansvariabel.
 * Klassen har en konstruktor som tillåter skapelsen av objekt av typ Kortlek
 * genom att uttnyttja fältet av Kort.
 * Klassen har också 2 instansmetoder:
 * "shuffle" för att blanda kortleken och "showFirst" för att visa det översta kortet.
 */
public class Kortlek {
    private Kort[] arrayKort; 		//ett fält av objekt Kort som instansvariabel


    /**En kostruktor som skapar ett objekt (Kortlek) som består av en array av objekt (Kort).
     * Konstruktorn skapar utrymmet för arrayen [52]. Sen utnyttjar den en nästlad loop (4 x 13)
     * för att gå genom hela arrayen och fylla den.
     * Den yttersta loopen hanterar index av färg, den innersta hanterar indexex av valören.
     * För varje dubbelt varv skapas ett kort som får indexen som parametrar
     * och ökar indexen av arrayen med ett.)
     */
    public Kortlek() {
        this.arrayKort = new Kort[52]; 		                            //utrymmet för arrayen
        int i = 0;                                                           //index för arrayen
        for (int colorIndex=0; colorIndex<= 3; colorIndex++)            //...för varje färg
            for (int valueIndex=0; valueIndex<=12; valueIndex++, i++) { //...genom alla valörer
                                                                        //nästa index i arrayen
                this.arrayKort[i] = new Kort(valueIndex, colorIndex);   // Kort skapelse

            }
    }


    /**
     * En metod som blandar kortleken, alltså arrayen av objekt av typ Kort.
     * Metoden går genom hela arrayen och byter referenserna slumpmässigt.
     */
    public void Shuffle () {
        for (int i = 0; i< arrayKort.length; i++){  //i går genom arrayen
            int r=(int) (Math.random()*52);         //random int mellan  och 51
            Kort temp = arrayKort[i];               //kortet[i] sparas i temp
            arrayKort[i] = arrayKort[r];            //kortet [i] blir kortet [r]
            arrayKort[r] = temp;                    //kortet [r] blir temp (dvs kortet [i])
        }
    }


    /**
     * Metoden visar ashkoden för kortet med index 0.
     * Metoden Kort.toString kommer att rätta utskriften.
     */
    public void showFirst () {
        System.out.println("\n\n-----------------------------");
        System.out.println("Översta kortet är " + this.arrayKort[51]);
        System.out.println("-----------------------------");
        //Kortet visas
    }


}