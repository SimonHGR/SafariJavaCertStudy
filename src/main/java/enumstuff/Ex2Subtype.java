package enumstuff;

import java.lang.reflect.Modifier;

/*final */enum Y {
  A{}, B{
//    @Override
//    public void doStuff() {}
  };
//  A, B;
  public static final Y anA = A;

  public final void doStuff() {}
}

//enum Z extends Y {}
public class Ex2Subtype {
  public static void main(String[] args) {
    Class<?> aType = Y.A.getClass();
    System.out.println(aType);
    Class<?> bType = Y.B.getClass();
    System.out.println(bType);
    System.out.println(aType == bType);

    Class<?> yType = Y.class;

    System.out.println("Is final? " + ((yType.getModifiers() & Modifier.FINAL) != 0));
  }
}
