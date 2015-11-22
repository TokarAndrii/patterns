package abstractFactory;

/**
 * Created by root on 14.11.15.
 */
public class NYPizzaIF implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Papperoni createPapperoni() {
        return null;
    }

    @Override
    public Calms createCalms() {
        return null;
    }
}
