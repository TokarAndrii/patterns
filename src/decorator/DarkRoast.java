package decorator;

/**
 * Created by root on 05.10.15.
 */
public class DarkRoast extends  Beverage {
    //concrete drink

    public DarkRoast() {
        description = "Dark Roast Coffe";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
