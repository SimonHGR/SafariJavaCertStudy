package initialization;

public class Singleton {
  private final static Singleton self = new Singleton();
  private Singleton() {
    System.out.println("Singleton constructor called");
  }
  public static Singleton get() {
    return self;
  }

  @Override
  public String toString() {
    return "I'm the Singleton";
  }
}

class UseSingleton {
  public static void main(String[] args) {
    Class<?> cl = Singleton.class;
    Singleton s0 = null;
    System.out.println(s0);
    System.out.println(cl);
    Singleton s = Singleton.get();
//    Singleton s2 = Singleton.get();
//    System.out.println(s == s2);
  }
}