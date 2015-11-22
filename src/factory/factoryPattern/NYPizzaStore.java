package factory.factoryPattern;

/**
 * Created by root on 10.11.15.
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }

      else  return null;
    }
}
