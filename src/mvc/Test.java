package mvc;

/**
 * Created by root on 21.09.15.
 */
public class Test {
    public static void main(String[] args) {
        Duck mullarduck = new MullardDuck();
        mullarduck.display();
        mullarduck.swim();
        mullarduck.performFly();
        mullarduck.performQuack();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

    }

}
