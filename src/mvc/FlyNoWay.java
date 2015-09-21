package mvc;

/**
 * Created by root on 21.09.15.
 */
public class FlyNoWay implements FlyBehaviour {


    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
