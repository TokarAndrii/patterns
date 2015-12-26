package singletone;

/**
 * Created by tokarAndrii on 26.12.15.
 */
public class TestSingletonChocolateBoiler {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler1= ChocolateBoiler.getUniqueinstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.drain();

        // will return the existing instance
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getUniqueinstance();
    }
}
