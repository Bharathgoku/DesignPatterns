package Structural.Adapter.Examples.FilterCoffeeApp;

public class FilterCoffeeAdapter implements FilterCoffeeMachine {

  private PremiumCoffeeMachine premiumCoffeeMachine;

  public FilterCoffeeAdapter(
      PremiumCoffeeMachine premiumCoffeeMachine) {
    this.premiumCoffeeMachine = premiumCoffeeMachine;
  }

  @Override
  public Coffee brewCoffee() {
    return premiumCoffeeMachine.brewCoffee(CoffeeType.FILTER_COFFEE);
  }
}
