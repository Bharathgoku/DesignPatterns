package Creational.Factory.SimpleFactory;

import Creational.Factory.FactoryMethod.Pizza;

public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    private Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
