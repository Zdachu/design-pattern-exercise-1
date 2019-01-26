package main;

import pizza.Pizza;
import pizza.PizzaFactory;
import pizza.PizzaType;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();



        Pizza capriciosaPizza = pizzaFactory.create(PizzaType.CAPRICIOSA);
        Pizza hawaiPizza = pizzaFactory.create(PizzaType.HAWAI);
        Pizza margheritaPizza = pizzaFactory.create(PizzaType.MARGHERITA);
        Pizza neapilitanaPizza = pizzaFactory.create(PizzaType.NEAPOLITANA);

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
        neapilitanaPizza.showPizzaInfo();
    }

}
