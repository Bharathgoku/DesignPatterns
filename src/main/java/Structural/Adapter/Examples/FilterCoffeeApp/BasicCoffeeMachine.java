package Structural.Adapter.Examples.FilterCoffeeApp;

import java.util.Map;

public class BasicCoffeeMachine implements FilterCoffeeMachine {

  private MachineConfig machineConfig;
  private Map<CoffeeType, GroundCoffee> groundCoffee;

  private BrewingUnit brewingUnit;

  public Coffee brewCoffee() {
    // get the coffee
    GroundCoffee groundCoffee = this.groundCoffee.get(CoffeeType.FILTER_COFFEE);
    return brewingUnit.brew(CoffeeType.FILTER_COFFEE, groundCoffee, machineConfig.getWaterQuantity());
  }

  public void addGroundCoffee(CoffeeType type, GroundCoffee newCoffee){
    GroundCoffee existingCoffee = groundCoffee.get(type);
    if(existingCoffee != null){
      // have to implement based on the business requirment;
    }else
      groundCoffee.put(type, newCoffee);
  }
}
