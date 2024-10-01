package overrideresolution;

public class Ex {
  public class OverloadResolution1 {
    void doStuff(int x, int y) {}         // Method A
//    void doStuff(int x, long y) {}        // Method B
//    void doStuff(long x, int y) {}        // Method C
    void doStuff(int ... x) {}            // Method D
    void doStuff(int y, int ... x) {}            // Method D
//    void doStuff(Integer x, Integer y) {} // Method E
//    void doStuff(Integer x, Number y) {} // Method E
//    void doStuff(Number x, Integer y) {} // Method E

    void tryStuff() {
      var x = 10_000_000_000L;
      doStuff(1, 2);
//      doStuff(1, 2, 3);
//      doStuff(1, new int[]{2});
//      doStuff(Integer.valueOf(1), Integer.valueOf(2));

//      Integer in1 = 1;
//      long l = in1;
    }
  }
}
