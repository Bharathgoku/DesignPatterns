package Structural.Adapter.Examples.FilterCoffeeApp;

public class FilterCoffeeApp {

  private FilterCoffeeMachine coffeeMachine;

  public FilterCoffeeApp(
      FilterCoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  public Coffee prepareCoffee(){
    Coffee coffee = this.coffeeMachine.brewCoffee();
    System.out.println("Coffee is ready!");
    return coffee;
  }
}
