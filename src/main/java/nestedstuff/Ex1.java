package nestedstuff;

import java.util.List;

class Outer {
  String name;

  class Inner{
    @Override
    public String toString() {
      return "Outer.Inner instance!";
    }
  }

  Inner getOne() {
//    return this.new Inner();
    return new Inner();
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Outer outer = new Outer();
//    Outer.Inner oi = outer.new Inner();
    Outer.Inner oi = new Outer().new Inner();
    System.out.println(oi);
    Outer o1 = null;
    System.out.println(o1.name);

//    "Hello";
    int x = 99;
    x++; // expression statement
    List<String> names = List.of("Inaya", "Ayo");
    names.add("Ishan");
  }
}
