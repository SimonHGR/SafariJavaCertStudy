package staticthis;

public class Ex {
  int x = 99;
  void doStuff() {
    int x = 100;
    System.out.println(this.x);
  }

  static void doStuff(Ex self) {
    int x = 100;
    System.out.println(self.x);
  }

  public static void main(String[] args) {
    Ex ex = new Ex();
//    ex.doStuff();
    Ex.doStuff(ex);
  }
}
