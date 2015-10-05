package decorator;

/**
 * Created by root on 05.10.15.
 */
public class HouseBlend extends Beverage {
    //concrete drink

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
