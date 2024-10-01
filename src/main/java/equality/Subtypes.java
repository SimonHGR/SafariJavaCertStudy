package equality;

import static java.lang.System.out;

class P {
  protected int x;

  public P(int x) {
    this.x = x;
  }
  // line n1
}

class Q extends P {
  private int y;

  public Q(int x, int y) {
    super(x);
    this.y = y;
  }

  public boolean equals(Object obj) {
    out.println("In q.equals(Object)");
    return obj instanceof Q other && super.equals(obj) && other.y == this.y;
  }
}

public class Subtypes {
  public static void main(String[] args) {
    P p = new P(10);
    P p2 = new P(10);
    P q = new Q(10, 10);
    P q2 = new Q(10, 12);
    out.print(p.equals(p2) + " ");
    out.print(p.equals(q) + " ");
    out.print(p.equals(q2) + " ");
    out.print(q.equals(p) + " ");
    out.println(q.equals(q2));
  }

//  which, inserted at line n1, causes the output true true true true true?

//  A)
//  public boolean equals(Object o) {
//    return o instanceof P other && this.x == other.x;
//  }
//
//  B)
//  public boolean equals(P other) {
//    return this.x == other.x;
//  }
//
//  C)
//  public boolean equals(Object o) {
//    return o.getClass() == P.class && o instanceof P other && this.x == other.x;
//  }
}

