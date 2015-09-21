package mvc;

/**
 * Created by root on 21.09.15.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
