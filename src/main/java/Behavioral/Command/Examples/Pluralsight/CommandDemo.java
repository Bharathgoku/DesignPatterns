package Behavioral.Command.Examples.Pluralsight;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

  public static void main(String args[]){
    Light bedRoomlight = new Light(); // reciever
    Light kitchenLight = new Light();
    Switch lightSwitch = new Switch(); // invoker

//    Command onCommand = new OnCommand(light);
//    Command toggleCommand = new ToggleCommand(light);
//    lightSwitch.storeAndExecute(onCommand);

//    lightSwitch.storeAndExecute(toggleCommand);
//    lightSwitch.storeAndExecute(toggleCommand);
//    lightSwitch.storeAndExecute(toggleCommand);

    List<Light> lights = new ArrayList<Light>();
    lights.add(bedRoomlight);
    lights.add(kitchenLight);
    Command allLightsCommand = new AllLightsCommand(lights);

    lightSwitch.storeAndExecute(allLightsCommand);
  }
}
