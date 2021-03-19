package Behavioral.TemplateMethod.Examples.Pluralsight;

public class StoreOrder extends OrderTemplate{

  @Override
  public void doCheckout() {
    System.out.println("Ring up item from cart");
  }

  @Override
  public void doPayment() {
    System.out.println("Process payment with Card present");
  }

  @Override
  public void doReceipt() {
    System.out.println("Print reciept");
  }

  @Override
  public void doDelivery() {
    System.out.println("Bag item at counter");
  }
}
