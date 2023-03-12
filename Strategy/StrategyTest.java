package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MallardDuck;

// Design Principle
// 1. Identify the aspects of your application that vary and 
//    separate them from what stays the same

// 2. Program to an interface, not an implementation

// 3. Favor composition over inheritance
//    HAS-A relationship can be better than IS-A

// benefits
// other types of objects can reuse fly and quack behaviors


public class StrategyTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
