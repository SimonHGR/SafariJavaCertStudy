package reflect;

import java.lang.reflect.Method;

public class Ex {
  public static void main(String[] args) {
    Object obj = "";

    Class<?> cl = obj.getClass();
    Method[] ma = cl.getMethods();
//    Method[] ma = cl.getDeclaredMethods();
    for (var m : ma) {
      System.out.println(m);
    }
  }
}
