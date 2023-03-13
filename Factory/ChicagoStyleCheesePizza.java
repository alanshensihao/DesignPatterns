package Factory;

public class ChicagoStyleCheesePizza extends Pizza{


    public ChicagoStyleCheesePizza() {
        super.name = "Chicago Style Sauce and Cheese";
        super.dough = "Thick crust dough";
        super.sauce = "Plum Tomato Sauce";

        super.toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
