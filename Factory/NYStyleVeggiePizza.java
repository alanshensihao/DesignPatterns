package Factory;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        super.name = "NYStyle Veggie Pizza";
        super.dough = "Veggie dough";
        super.sauce = "Veggie sauce";

        super.toppings.add("tomato");
        super.toppings.add("lettuce");
        super.toppings.add("olives");
    }
}
