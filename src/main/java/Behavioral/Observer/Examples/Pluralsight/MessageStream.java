package Behavioral.Observer.Examples.Pluralsight;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{

  private Deque<String> messageHistory = new ArrayDeque<String>();

  @Override
  void setState(String message) {
    messageHistory.add(message);
    this.notifyObservers();
  }

  @Override
  String getState() {
    return messageHistory.getLast();
  }
}
