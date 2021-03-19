package Behavioral.Visitor.Examples.Pluralsight;

public class Oil implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
