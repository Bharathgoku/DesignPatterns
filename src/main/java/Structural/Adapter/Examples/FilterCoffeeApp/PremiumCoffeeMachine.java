package Structural.Adapter.Examples.FilterCoffeeApp;

import java.util.Map;

public class PremiumCoffeeMachine {

  private Map<CoffeeType, MachineConfig> configMap;
  private BrewingUnit brewingUnit;
  private Grinder grinder;

  public Coffee brewCoffee(CoffeeType type){
    switch(type){
      case CAPUCCINO:
        return brewCupuccino();
      case BLACK_COFFEE:
        return brewBlackCoffee();
      case FILTER_COFFEE:
        return brewFilterCoffee();
      case EXPRESSO:
        return brewExpresso();
      default:
        System.out.println("Selected Coffee type doesn't exist");
        return null;
    }
  }

  private Coffee brewCupuccino(){
    MachineConfig machineConfig = configMap.get(CoffeeType.CAPUCCINO);

    // get the coffee
    GroundCoffee groundCoffee = grinder.grind(machineConfig.getCoffeeQuantity());
    return brewingUnit.brew(CoffeeType.CAPUCCINO, groundCoffee, machineConfig.getWaterQuantity());
  }

  private Coffee brewBlackCoffee(){
    MachineConfig machineConfig = configMap.get(CoffeeType.BLACK_COFFEE);

    // get the coffee
    GroundCoffee groundCoffee = grinder.grind(machineConfig.getCoffeeQuantity());
    return brewingUnit.brew(CoffeeType.BLACK_COFFEE, groundCoffee, machineConfig.getWaterQuantity());
  }

  private Coffee brewFilterCoffee(){
    MachineConfig machineConfig = configMap.get(CoffeeType.FILTER_COFFEE);

    // get the coffee
    GroundCoffee groundCoffee = grinder.grind(machineConfig.getCoffeeQuantity());
    return brewingUnit.brew(CoffeeType.FILTER_COFFEE, groundCoffee, machineConfig.getWaterQuantity());
  }

  private Coffee brewExpresso(){
    MachineConfig machineConfig = configMap.get(CoffeeType.EXPRESSO);

    // get the coffee
    GroundCoffee groundCoffee = grinder.grind(machineConfig.getCoffeeQuantity());
    return brewingUnit.brew(CoffeeType.EXPRESSO, groundCoffee, machineConfig.getWaterQuantity());
  }



}
