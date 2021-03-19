package Behavioral.Strategy.Examples.Pluralsight;

public class CreditCard {

  private String number;
  private String date;
  private String cvv;
  private ValidationStrategy strategy;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public CreditCard(ValidationStrategy strategy){
    this.strategy = strategy;
  }

  public boolean isValid(){
    return strategy.isValid(this);
  }

}
