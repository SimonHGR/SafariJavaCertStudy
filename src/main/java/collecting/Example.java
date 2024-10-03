package collecting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Customer(String name, int credit) {}
public class Example {
  public static void main(String[] args) {
    List<Customer> st = List.of(new Customer("Fred", 100),
        new Customer("Fred", 200),
        new Customer("Jim", 30),
        new Customer("Jimmy", 10)
    );
    var result = st.stream()
        .collect(Collectors.groupingBy(c -> c.name(),
            Collectors.counting()));

    System.out.println(result);

    System.out.println(st.stream()
        .collect(Collectors.groupingBy(c -> c.name(),
            Collectors.mapping(c -> c.name() + c.credit(),
                Collectors.joining(", ")))));
  }
}

