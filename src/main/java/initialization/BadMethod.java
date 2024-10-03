package initialization;

class Parenty {
  {
    System.out.println("y is " + this.y);
  }
  int y = 10;
  String n;
  Parenty() {
    // implicit super(); then instance initialization
    System.out.println("in Parenty initialization");
    doStuff(); // BAD!!! do not call overrideable methods in constructors
    System.out.println("In constructor n is " + n);
  }
  void doStuff() {
    System.out.println("parent.doStuff");
    n = "Hello";
    System.out.println("In doStuff n is " + n);
  }
}

public class BadMethod extends Parenty {
  public BadMethod() {
    super();
  }

  public static void main(String[] args) {
    BadMethod bm = new BadMethod();
  }

  public void doStuff() {
    System.out.println("In BadMethod.doStuff()");
  }
}
