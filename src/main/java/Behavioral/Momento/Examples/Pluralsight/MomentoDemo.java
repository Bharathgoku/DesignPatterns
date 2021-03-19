package Behavioral.Momento.Examples.Pluralsight;

public class MomentoDemo {

  public static void main(String[] args){
    Caretaker caretaker = new Caretaker();

    Employee emp = new Employee();

    emp.setName("John Wick");
    emp.setAddress("111 Main Street");
    emp.setPhone("7060467073");

    caretaker.save(emp);

    emp.setPhone("8919764156");

    caretaker.revert(emp);



  }
}
