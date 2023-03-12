package Strategy.Duck;

import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

// mallardduck is a real duck that can quack and fly
public class MallardDuck extends Duck{
    public MallardDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
