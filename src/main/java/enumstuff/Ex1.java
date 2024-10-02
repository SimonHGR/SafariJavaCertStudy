package enumstuff;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

enum X {
  THING1(LocalDate.now()), THING2; // private static final fields
//  private static final X T3 = new X(); // NOPE!!!
  X(LocalDate ld) {
    System.out.println("constructing X with " + ld);
  }
  X() {
    System.out.println("constructing X");
  }
}

public class Ex1 {
  public static void main(String[] args) {
    System.out.println("step 1");
    Class<?> cl = X.class;
    System.out.println("step 2");
    Constructor<?>[] cons = cl.getDeclaredConstructors();
    System.out.println("step 3");
    for (var c : cons) {
      System.out.println(c);
    }
    System.out.println("step 4");
    System.out.println(X.THING1);
    System.out.println("step 5");

  }
}
