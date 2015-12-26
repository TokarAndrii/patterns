package factory.factoryPattern;

/**
 * Created by root on 10.11.15.
 */
public class TestPizza {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
        //Pizza pizza = nyStore.orderPizza("cheese");
    }
}
