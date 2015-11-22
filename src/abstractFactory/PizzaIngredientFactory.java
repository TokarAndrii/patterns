package abstractFactory;

/**
 * Created by root on 14.11.15.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Papperoni createPapperoni();

    public Calms createCalms();


}
