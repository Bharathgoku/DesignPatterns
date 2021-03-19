package Behavioral.State.Examples.Pluralsight;

public class FanLowState extends State {

  private Fan fan;

  public FanLowState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest(){
    System.out.println("Turning fan to Med.");
    fan.setState(fan.getFanMedState());
  }

  public String toString(){
    return "Fan is Low.";
  }
}
