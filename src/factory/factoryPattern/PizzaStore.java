package factory.factoryPattern;

/**
 * Created by root on 10.11.15.
 */
public abstract class PizzaStore {
   public abstract Pizza createPizza(String type);

   public  Pizza orderPizza(String type){
      Pizza pizza;
      pizza = createPizza(type);

      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();

      return pizza;

   };


}
