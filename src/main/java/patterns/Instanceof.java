package patterns;


import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Instanceof {
  public static void main(String[] args) {
    Iterable<String> is = List.<String>of("a", "b", "c");
//    Iterable<? extends CharSequence> is = List.<String>of("a", "b", "c");
//    Iterable<? extends CharSequence> is = List.<StringBuilder>of();
    Object obj = is;

    System.out.println(is instanceof List);
    System.out.println(obj instanceof List l && l.size() > 2);
//    System.out.println(obj instanceof List<String> ls);
//    System.out.println(is instanceof List<String> cs);
    System.out.println(is instanceof Collection<? extends CharSequence> cs);
//    System.out.println(is instanceof List<String> ls || ls.size() > 2);

    if (is instanceof List) {
      List l = (List) is;
      System.out.println("number of items in list is " + l.size());
    }
    if (is instanceof /*final */ List l) {
      System.out.println("number of items in list is " + l.size());
      l = null;
    } else {
//      System.out.println(l); // NOPE, l was not initiaized here
    }
//      if (is instanceof List<String> l) {
    if (is instanceof List<? extends CharSequence> l) {
      System.out.println("First character of first list element is " + l.get(0).charAt(0));
//        System.out.println("Uppercase? " + l.get(0).toUpperCase()); // not for CharSequence
    }

//    String s1 = new String("Hello");
//    System.out.println(s1);
//    s1 = s1.toUpperCase();
//    System.out.println(s1);

    StringBuilder sb1 = new StringBuilder("Hello");
    System.out.println(sb1);
    sb1.append(" World");
    System.out.println(sb1);
  }
}
