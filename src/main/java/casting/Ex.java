package casting;

/*final*/ class Base {
//sealed class Base permits Sub {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

final class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }
  void doOtherStuff() { System.out.println("doOtherStuff"); }
}

//class SubR extends Base implements Runnable {
//
//  @Override
//  public void run() {
//    System.out.println("I'm running!");
//  }
//}

public class Ex {
  public static void main(String[] args) {
    Base b = new Sub();
//    Base b = new SubR();
    ((Runnable) b).run();
//    (String)b;
  }
}
