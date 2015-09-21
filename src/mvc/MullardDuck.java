package mvc;

/**
 * Created by root on 21.09.15.
 */
public class MullardDuck extends Duck {
    public MullardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real mullard duck");
    }
}
