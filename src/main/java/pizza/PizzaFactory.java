package pizza;

import java.util.Arrays;

public class PizzaFactory {

    public Pizza create(PizzaType pizzaType) {
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(29.00, Arrays.asList("Cheese", "Ham", "Champignons"), PizzaType.CAPRICIOSA);
        } else if (pizzaType.equals(PizzaType.MARGHERITA)) {
            return new MargheritaPizza(24.00, Arrays.asList("Cheese", "Oregano"), PizzaType.MARGHERITA);
        } else if (pizzaType.equals(PizzaType.HAWAI)) {
            return new HawaiPizza(28.00, Arrays.asList("Cheese", "Oregano", "Pineapple"), PizzaType.MARGHERITA);
        } else if (pizzaType.equals(PizzaType.NEAPOLITANA)) {
            return new NeapolitanaPizza(30.00, Arrays.asList("Cheese", "Olives", "Salami"), PizzaType.NEAPOLITANA);
        } else return null;
    }

}
