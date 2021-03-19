package Behavioral.Visitor.Examples.Pluralsight;

public class VisitorDemo {
  public static void main(String[] args){
    PartsOrder order = new PartsOrder();
    order.addPart(new Wheel());
    order.addPart(new Oil());
    order.addPart(new Fender());
    order.accept(new AtvpartsShippingVisitor());
    order.accept(new AtvpartsDisplayVisitor());
  }
}
