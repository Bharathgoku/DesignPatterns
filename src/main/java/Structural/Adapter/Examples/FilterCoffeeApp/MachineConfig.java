package Structural.Adapter.Examples.FilterCoffeeApp;

public class MachineConfig {

  private int waterQuantity;

  private int coffeeQuantity;

  public MachineConfig(int waterQuantity, int coffeeQuantity) {
    this.waterQuantity = waterQuantity;
    this.coffeeQuantity = coffeeQuantity;
  }

  public int getWaterQuantity(){
    return waterQuantity;
  }

  public int getCoffeeQuantity(){
    return coffeeQuantity;
  }
}
