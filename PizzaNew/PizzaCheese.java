package PizzaNew;

public class PizzaCheese extends Pizza {

    private Pizza pizza;

    public PizzaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String description() {
        return pizza.description() + " [cheese]";
    }

}