package se.nackademin;

/**En klass som tillåter skapelsen och utskriften av ett objekt av typ Kort (french cards)
 * objektet ska utnyttjas av klassen Kortlek för att skapa ett objekt Kortlek (fält av objekt Kort)
 * Instansvariablerna är index (int) för färgen och valören,
 * En String array {"hjärter","ruter","klöver","spader"} kopplas till index av färger
 * för att få den önskade utskriften.
 * Klassen innehåller en enkel konstruktor och en metod toString.
 */
public class Kort {
    private int valueIndex;
    private int colorIndex;      //             0        1       2       3
    private static final String[] COLOR = {"hjärter","ruter","klöver","spader"};
    // String fält som vi ska använda för att skriva ut kortets färg (som är int {0,1,2,3} i början)
    // för att rätta valören räcker det att använda (valör + 1) (det är {0,1,...12} i början)

    /**
     * Konstruktor av objekt Kort.
     * @param valueIndex
     * @param colorIndex
     */
    public Kort(int valueIndex, int colorIndex) {		//konstruktor
         this.valueIndex = valueIndex;
         this.colorIndex = colorIndex;
    }

    /**
     * En metod som tillåter och rättar utskriften av objektet Kort:
     * 1) från hashcode till värden
     * 2) rättning av index:
     * {0,1,2,3} blir {"hjärter","ruter","klöver","spader"} och {0,1,...12} blir {1,2,...13}
     * @return
     * en string
     */
    @Override
    public String toString() {
        return (COLOR[colorIndex] + " " + (this.valueIndex + 1));


    }
}



