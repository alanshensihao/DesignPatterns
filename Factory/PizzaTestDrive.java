package Factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza nyPizza = nyStore.createPizza("cheese");
        System.out.println("pizza order at NY is " + nyPizza.getName());

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.createPizza("cheese");
        System.out.println("pizza order at NY is " + chicagoPizza.getName());
    }
}
