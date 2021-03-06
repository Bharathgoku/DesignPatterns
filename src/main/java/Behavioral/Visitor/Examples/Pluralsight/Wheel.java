package Behavioral.Visitor.Examples.Pluralsight;

public class Wheel implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
