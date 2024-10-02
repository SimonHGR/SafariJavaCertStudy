package switchstuff;

import static java.lang.System.out;

public class Ex2 {
  public static void main(String[] args) {
    enum X { HELLO, GOODBYE; }
    X x = X.HELLO;

//    Which cause the output of "Hello"?
//        A)
//    out.println(
//        switch (x) {
//          case HELLO ->
//          case GOODBYE ->
//              yield "Hello";
//        });
//
//    B)
//    out.println(switch(x) {
//      case HELLO -> "Hello";
//    });
//
//    C)
//    out.println(switch(x) {
//      case HELLO -> {
//        var var = "Hello";
//        yield var;
//      }
//      default -> "";
//    });
//
//    D)
//    out.println(switch(x) {
//      case HELLO: {
//        var var = "Hello";
//        yield var;
//      }
//      default: "";
//
//        E)
//        out.println(switch(x) {
//          case HELLO, GOODBYE:
//            yield "Hello";
//        });
//
//        F)
//        Object obj = x;
//        out.println(switch(obj) {
//          case HELLO, GOODBYE -> "Hello";
//        });
//
//        G)
//        out.println(switch(x) {
//          case X.HELLO, X.GOODBYE -> { yield "Hello"; }
//        });

    }
}
