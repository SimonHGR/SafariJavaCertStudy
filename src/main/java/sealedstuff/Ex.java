package sealedstuff;

sealed interface Transporter permits Truck, Car, Fleet, Bicycle {}
final class Truck implements Transporter {
  private int payload;

  public Truck(int payload) {
    this.payload = payload;
  }

  public int getPayload() {
    return payload;
  }
}
//class Aeroplane {}
//sealed class Car implements Transporter permits ReliantRobin {
non-sealed class Car implements Transporter {
  int seats;

  public Car(int seats) {
    this.seats = seats;
  }

  public int getSeats() {
    return seats;
  }
}

// enums are "almost" final
//enum Fleet implements Transporter {}
record Fleet() implements Transporter {}

//final class ReliantRobin extends Car {
//  public ReliantRobin() {
//    super(2);
//  }
//}

final class Bicycle implements Transporter {
}

public class Ex {
  public static boolean canCarry(Object obj, int weight) {
    boolean canCarry = true;
    if (obj instanceof Truck t) { // in Java 21, this would be switch on TYPE
      canCarry = t.getPayload() >= weight;
    } else if (obj instanceof Car c) {
      canCarry = (c.getSeats() - 1) * 170 >= weight;
    }
    return canCarry;
  }

  public static void main(String[] args) {
    Object obj = new Car(5);
    System.out.println("can the car carry 300lb? " + canCarry(obj, 300));
    System.out.println("can the car carry 700lb? " + canCarry(obj, 700));

//    obj = new Bicycle();
//    System.out.println("can the bicycle carry 300lb? " + canCarry(obj, 300));
//    System.out.println("can the bicycle carry 700lb? " + canCarry(obj, 700));


  }
}
