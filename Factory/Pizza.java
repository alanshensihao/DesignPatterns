package Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    
    protected String name;
    protected String dough;
    protected String sauce;
    List<String> toppings = new ArrayList<String>();


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("Add " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350F");
    }

    public void cut() {
        System.out.println("Cut in 12 slices");
    }

    public void box() {
        System.out.println("Box it up");
    }

    public String getName() {
        return name;
    }
}
