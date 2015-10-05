package decorator;

/**
 * Created by root on 05.10.15.
 */
public class Espresso extends Beverage {

    //concrete drink


    public Espresso() {
        description = "Espresso";
        //descriptions - extends from Beverage!!!
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
