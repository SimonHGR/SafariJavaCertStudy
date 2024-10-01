package logicaland;

public class Ex {
  private static int count = 22;

  public static boolean getValue() {
    count++;
    return true;
  }

  public static void main(String[] args) {

    boolean b1 = true;
    if (!b1 & getValue()) {
      System.out.println(count);
    } else {
      System.out.println("No " + count);
    }
  }
}
