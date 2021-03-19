package Behavioral.Command.Examples.Pluralsight;

import jdk.nashorn.internal.objects.annotations.Getter;

//receiver
public class Light {

  private boolean isOn = false;
  private String location = "";

  public Light(){

  }
  public Light(String location){
    this.location = location;
  }
  public boolean isOn(){
    return isOn;
  }

  public void toggle(){
    if(isOn){
      off();
      isOn = false;
    }else{
      on();
      isOn = true;
    }
  }
  public void on(){
    System.out.println("Light switched On");
  }

  public void off(){
    System.out.println("Light switched Off");
  }
}
