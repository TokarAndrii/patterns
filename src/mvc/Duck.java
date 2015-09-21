package mvc;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void performFly(){
        flyBehaviour.fly();
    }


    public void performQuack(){
        quackBehaviour.quack();
    }


    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}