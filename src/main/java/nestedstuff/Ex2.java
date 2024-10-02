package nestedstuff;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//@Target(ElementType.PARAMETER)
//@interface NotNull {}

class Outer2 {
  class Inner2 {
//    Outer2 myEnclosingOuter2;

// line n1
    Inner2(Outer2 Outer2.this) {
//      myEnclosingOuter2 = Outer2.this;
    }

    void doStuff(/*@NotNull */Inner2 this) {
//      Outer2.this = null;
      System.out.println(Outer2.this);
    }
  }

  Outer2(/*Outer2 this -- inconsistenly, this is not permitted*/) {
    System.out.println(this);
//    this = null;
  }
}

public class Ex2 {
  public static void main(String[] args) throws Throwable {
    Class<?> cl = Outer2.Inner2.class;
    Constructor<?>[] ca = cl.getDeclaredConstructors();
    for (var c : ca) {
      System.out.println(c);
    }

    Method m = cl.getDeclaredMethod("doStuff");
    System.out.println(m);
  }
}