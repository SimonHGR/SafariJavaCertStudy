package switchstuff;

public class Ex {
  public static void main(String[] args) {
    int x = 99;
    switch (x) {
      case 98 -> System.out.println("98");
      case 99 -> System.out.println("99");
      case 100 -> System.out.println("100");
    }

    System.out.println("-----------------");
    System.out.println(switch (x) {
          case 98 -> "98";
          case 99 -> {
            String prefix = "9";
            String whole =prefix + "9";
            yield whole;
          }
          case 100 -> "100";
          default -> throw new IllegalArgumentException("Bad input value!");
        }
    );



  }
}
