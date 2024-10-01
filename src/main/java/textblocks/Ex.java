package textblocks;

import static java.lang.System.out;

public class Ex {
  public static void main(String[] args) {
//    String A = """
//    "hello"
//      java    """;
//    var message = "X" + A + "X";

//    String B = """
//    "hello"
//      java
//      """;
//    var message = "X" + B + "X";
//
//    String C = """
//    \qhello\q
//      java
//    """;
//    var message = "X" + C + "X";
//
//    String D = """
//    \"hello\"
//        java""";
//    var message = ("X" + D + "X").indent(-4);
//
//    String E = """"hello"
//      java""";
//    var message = ("X" + E + "X").indent(-4);
//
    String F = """
    "hello"\n   java""";
    var message = "X" + F + "X";
//
    out.println(message);
  }
}
