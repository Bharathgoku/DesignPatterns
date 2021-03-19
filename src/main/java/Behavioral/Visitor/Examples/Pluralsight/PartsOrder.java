package Behavioral.Visitor.Examples.Pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart{

  private List<AtvPart> parts ;

  public PartsOrder() {
    this.parts = new ArrayList<AtvPart>();
  }

  public List<AtvPart> getParts() {
    return parts;
  }

  public void addPart(AtvPart atvPart) {
    this.parts.add(atvPart);
  }


  @Override
  public void accept(AtvPartVisitor visitor) {
    for(AtvPart atvPart : parts){
      atvPart.accept(visitor);
    }
    visitor.visit(this);
  }
}
