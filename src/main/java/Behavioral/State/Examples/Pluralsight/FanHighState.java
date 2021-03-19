package Behavioral.State.Examples.Pluralsight;

public class FanHighState extends State {

  private Fan fan;

  public FanHighState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest(){
    System.out.println("Turning fan on to Off.");
    fan.setState(fan.getFanOffState());
  }

  public String toString(){
    return "Fan is High.";
  }

}
