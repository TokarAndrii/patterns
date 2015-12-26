package abstractFactory;

/**
 * Created by tokarAndrii on 26.12.15.
 */
public class TestAbstractPizzaFactory {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
