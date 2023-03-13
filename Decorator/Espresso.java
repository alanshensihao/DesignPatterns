package Decorator;

public class Espresso extends Beverage{

    public Espresso() {
        super.description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
