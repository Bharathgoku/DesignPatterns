package Behavioral.Visitor.Examples.Pluralsight;

public interface AtvPartVisitor {

  void visit(Oil oil);

  void visit(Wheel wheel);

  void visit(Fender fender);

  void visit(PartsOrder partsOrder);
}
