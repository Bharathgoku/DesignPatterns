package Behavioral.Strategy.Examples.Pluralsight;

public class StrategyDemo {

  public static void main(String[] args){

    CreditCard amexCard = new CreditCard(new AmexStrategy());

    amexCard.setNumber("379123456789098");
    amexCard.setDate("04/2020");
    amexCard.setCvv("123");

    System.out.println("is Amex valid: " + amexCard.isValid());
  }

}
