package mvc;

/**
 * Created by root on 21.09.15.
 */
public class FlyRocketPowered implements  FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
