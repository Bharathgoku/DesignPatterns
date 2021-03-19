package Behavioral.Command.Examples.Pluralsight;

//invoker
public class Switch {

  public void storeAndExecute(Command command){
    command.execute();
  }
}
