package decorator;

/**
 * Created by root on 05.10.15.
 */
public class Mocha extends CondimentDecorator {

    //decorator

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
