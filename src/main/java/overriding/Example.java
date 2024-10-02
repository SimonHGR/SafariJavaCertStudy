package overriding;

class Enclosing {
  static class P {
    String name = "Parent";

    /*final*/
    private void doStuff() {
      System.out.println("P.doStuff()");
    }
  }

  static class C extends P {
    String name = "Child";

//      @Override
    void doStuff() {
      System.out.println("C.doStuff()");
      ((P)this).doStuff();
    }

    void doOtherStuff() {
      System.out.println("C.doOtherStuff()");
    }
  }

  public static class Example {
    public static void main(String[] args) {
      P p = new C();
//    p.doOtherStuff(); // type of REFERENCE determines "compilable" methods

      // for OVERRIDABLE INSTANCE METHODS (ONLY!!!!) type of the object
      // determines the behavior
      p.doStuff();

      System.out.println(p.name);

      System.out.println("-----------------");
      C c = new C();
      c.doStuff();
    }
  }
}