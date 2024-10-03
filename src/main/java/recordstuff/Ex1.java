package recordstuff;


//interface X {
//  public abstract void doStuff();
//}
// records are an attempt to create functional programming type data, i.e. "immutable"
// "components" will become private final fields
// get toString, equals, hashCode based on the components
// can override them (technically "replacing" not overriding -- CANNOT use "super").
// no extends, and records cannot be extended, but CAN implement interfaces
record R1(String s) { // parent is java.lang.Record, but no extends clause allowed
//  private int x; // NOT ALLOWED
  static int y; // This is OK

  // default constructor will be the "canonical" constructor
  // but can take charge of initialization
  // MUST have signature from "record" line...
//  R1(String str) { // NOT ALLOWED!
//  R1(String s) {
//    if (s == null || s.length() == 0) {
//      throw new IllegalArgumentException();
//    }
//    s += "Mr. ";
//    this.s = s; // this MUST be last... BECAUSE IT'S final..
//  }

  // "compact" constructor EITHER/OR canonical
  // if provided "compact" constructor is used to build the canonical...
  R1 {
    if (s == null || s.length() == 0) {
      throw new IllegalArgumentException();
    }
    s = "Mr. " + s;
    // NO references to the fields (this.s etc.)
    // canonical constructor is pasted, by compiler, at the
    // completion of this code block
    // this.s = s;
  }

  R1(int x, String banana) {
    this("" + x);
  }

  R1(float x, double y) {
    this((int)(x + y), "Odd");
  }

  @Override
  public String toString() {
//    return "Overriding version: " + super.toString(); // NO SUPER :)
    return "Overriding version: s is " + this.s;
  }
  // accessor methods, created automatically in this form:
  // public zero args, return type matches component*, no checked exceptions
  @Override
  public String s() {
    System.out.println("calling special accessor");
    return this.s;
  }
}

public class Ex1 {
  public static void main(String[] args) {
    R1 r1 = new R1("Simple Record");
    System.out.println(r1);
    System.out.println("s is " + r1.s());
  }
}
