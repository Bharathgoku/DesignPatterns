package Behavioral.Visitor.Examples.Pluralsight;

public class Fender implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
