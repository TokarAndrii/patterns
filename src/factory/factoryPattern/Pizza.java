package factory.factoryPattern;

import java.util.ArrayList;

/**
 * Created by root on 10.11.15.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sause;

    ArrayList toppings = new ArrayList();

    /*public Pizza orderPizza(String type){
        Pizza pizza;



    }*/

    void prepare (){
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough ...  ");
        System.out.println("Adding sause ...  ");
        System.out.println("Adding toppings:  ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" "+toppings.get(i));

        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350 C");
    }

    void cut(){
        System.out.println("Cutting pizza into slices");
    }

    void box(){
        System.out.println("Place pizza to PizzaStore box.");
    }

    public String getName() {
        return name;
    }
}
