package abstractFactory;

/**
 * Created by tokarAndrii on 26.12.15.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing "+" name");
        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
        cheese=pizzaIngredientFactory.createCheese();

    }
}
