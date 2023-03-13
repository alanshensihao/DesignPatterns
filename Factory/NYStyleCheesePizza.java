package Factory;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        super.name = "NY Style Sauce and Cheese";
        super.dough = "Thin crust dough";
        super.sauce = "Marina Sauce";

        super.toppings.add("Grated Reggiano Cheese");
    }
}
