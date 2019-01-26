package pizza;

import java.util.List;

public class HawaiPizza extends Pizza {
    private double cost;
    private List<String> components;

    public HawaiPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }


}
