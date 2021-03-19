package Behavioral.Mediator.Examples.Pluralsight;

import Behavioral.Command.Examples.Pluralsight.Command;

public class TurnOffAllLightsCommand implements Command {

  private Mediator med ;

  public TurnOffAllLightsCommand(Mediator mediator) {
    this.med = mediator;
  }

  public void execute(){
    med.turnOffAllLights();
  }
}
