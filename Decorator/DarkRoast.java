package Decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    public double cost() {
        return 1.99;
    }
}
