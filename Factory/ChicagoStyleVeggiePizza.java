package Factory;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        super.name = "Chicago Style Veggie Pizza";
        super.sauce = "Chicago veggie sauce";
        super.dough = "Chicago dough";

        super.toppings.add("pineapple");
    }
}
