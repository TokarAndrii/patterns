package abstractFactory;

/**
 * Created by tokarAndrii on 26.12.15.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Papperoni papperoni;
    Calms calms;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25m at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("place pizzza in official box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
