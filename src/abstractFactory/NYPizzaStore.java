package abstractFactory;

/**
 * Created by tokarAndrii on 26.12.15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIF();

        if(item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Style Cheese pizza");
        }

        if(item.equals("calm")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY Style Calm pizza");
        }

        return pizza;
    }
}
