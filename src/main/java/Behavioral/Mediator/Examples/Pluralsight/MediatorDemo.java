package Behavioral.Mediator.Examples.Pluralsight;

import Behavioral.Command.Examples.Pluralsight.Command;
import Behavioral.Command.Examples.Pluralsight.Light;

public class MediatorDemo {

  public static void main(String[] args){
    Mediator mediator = new Mediator();

    Light bedRoomLight = new Light("Bedroom");
    Light kitchenLight = new Light("Kitchen");

    mediator.registerLight(bedRoomLight);
    mediator.registerLight(kitchenLight);

    Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);

    turnOnAllLights.execute();

    Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);

  }
}
