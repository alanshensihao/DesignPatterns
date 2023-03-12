package Strategy.Duck;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}