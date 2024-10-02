package switchstuff;

public class Fallthrough {
  public static void main(String[] args) {
    int x = 98;
    System.out.println(switch (x) {
      case 98:
      case 99:
        int val = 10;
        System.out.println("it's 98 or 99, val is " + val);
//        yield "98 or 99!";
//        break;
      case 100:
        System.out.println("val is " /*+ val*/);
        System.out.println("it's 100");
        yield "message for 100";
      default:
        yield "XXX";
    });
  }
}
