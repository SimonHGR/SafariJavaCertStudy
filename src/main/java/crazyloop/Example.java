package crazyloop;

public class Example {
  public static void main(String[] args) {
    var b = (byte) 126;
    outer:
    for (var n = 1000; n < 1002; n++) {
      System.out.printf("L1: b = %d, n = %d\n", b, n);
      for (var j = 4; j >= 0; j--, b++) {
        System.out.printf("L2: b = %d, n = %d, j = %d\n", b, n, j);
        if (j < 3) break;
        else if (n == 1001) continue outer;
        b++;
        System.out.printf("L3: b = %d, n = %d, j = %d\n", b, n, j);
      }
    }
    System.out.printf("b = %d\n", b);
//  L1: b = 126, n = 1000
//  L2: b = 126, n = 1000, j = 4
//  L3: b = 127, n = 1000, j = 4
//  L2: b = -128, n = 1000, j = 3
//  L3: b = -127, n = 1000, j = 3
//  L2: b = -126, n = 1000, j = 2
//  L1: b = -126, n = 1001
//  L2: b = -126, n = 1001, j = 4

  }
}
