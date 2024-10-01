package typerange;

public class Example {
  public static void main(String[] args) {
//    var b = (byte) 126;
//    System.out.println(b+5); // arithmetic happens in int, long, float, double ONLY

    var b = (byte) 126;
    b += 5; // legal, special case for assignment operators
//    b = b + 5; // NOT LEGAL, result is int type
    System.out.println(b);

//    short s1 = 1;
//    short s2 = 1;
//    short s3 = s1 + s2;
  }
}
