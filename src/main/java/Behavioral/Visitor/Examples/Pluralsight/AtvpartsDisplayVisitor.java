package Behavioral.Visitor.Examples.Pluralsight;

public class AtvpartsDisplayVisitor implements AtvPartVisitor {

  @Override
  public void visit(Oil oil) {
    System.out.println("We have oil");
  }

  @Override
  public void visit(Wheel wheel) {
    System.out.println("We have a Wheel");
  }

  @Override
  public void visit(Fender fender) {
    System.out.println("We have a fender");
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    System.out.println("We have an order");
  }
}
