package Behavioral.Momento.Examples.Pluralsight;

import java.util.Stack;

//caretaker
public class Caretaker {

  private Stack<EmployeeMomento> employeeHistory = new Stack<EmployeeMomento>();
  public void save(Employee emp){
    employeeHistory.push(emp.save());
  }

  public void revert(Employee emp){
    emp.revert(employeeHistory.pop());
  }
}
