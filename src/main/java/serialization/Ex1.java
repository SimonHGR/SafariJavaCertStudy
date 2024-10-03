package serialization;

import java.io.*;
import java.util.Arrays;

//enum Category {
//  PERSON, CORPORATION;
//}

class Category {
  public static Category PERSON = new Category("PERSON");
  public static Category CORPORATION = new Category("CORPORATION");
  private String name;
  public Category(String name) {
    this.name = name;
  }
}

class PParent implements Serializable {
  String ppName = "Hello";
  String ppField2;
  PParent() {
    // implicit super();
    // instance init...
    System.out.println("in PParent zero-arg constructor");
    ppField2 = "Some value";
  }

  @Override
  public String toString() {
    return "PParent{" +
        "ppName='" + ppName + '\'' +
        ", ppField2='" + ppField2 + '\'' +
        '}';
  }
}

class Person extends PParent implements Serializable { // zero methods in Serialiazble
  private static final long serialVersionUID = 100;

  public static String[] prefixes = {"Mr", "Mrs", "Ms", "Mx"};
  private String name;
  private String address;
  private String newField = "new field";
  private transient Category category = Category.PERSON;
  private transient int credit;

  {
    System.out.println("Person instance initialization");
  }

  public Person(String name, String address, int credit) {
    System.out.println("Person constructor");
    this.name = name;
    this.address = address;
    this.credit = credit;
  }

  private void writeObject(ObjectOutputStream oos) throws Throwable {
    System.out.println("running writeObject");
    oos.defaultWriteObject();
  }

  private void readObject(ObjectInputStream ois) throws Throwable {
    System.out.println("running readObject");
    ois.defaultReadObject();
  }

  @Override
  public String toString() {
    return super.toString() + " Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", credit=" + credit +
        ", category=" + category +
        ", newField=" + newField +
        ", prefixes=" + Arrays.toString(prefixes) +
        '}';
  }
}
public class Ex1 {
  public static void main(String[] args) throws Throwable {
    Person p1 = new Person("Ishan", "down the hill", 10_000);
    Person p2 = new Person("Hua", "in the mansion", 20_000);
    System.out.println("p1 is " + p1);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(p1);

    p1.prefixes = new String[]{"X"};
    System.out.println("p1 is " + p1);

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    Object obj = ois.readObject();
    if (obj instanceof Person p) {
      System.out.println("read a person: " + p);
      System.out.println("p1 is " + p1);
    } else {
      System.out.println("Wait, what is this: " + obj
          + " is a " + obj.getClass().getName());
    }
  }
}

class Ex2Write {
  public static void main(String[] args) throws Throwable {
    Person p1 = new Person("Ishan", "down the hill", 10_000);

    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"));
    oos.writeObject(p1);
    oos.flush();
  }
}

class Ex2Read {
  public static void main(String[] args) throws Throwable {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"));
    Object obj = ois.readObject();
    if (obj instanceof Person p) {
      System.out.println("read a person: " + p);
    } else {
      System.out.println("Wait, what is this: " + obj
          + " is a " + obj.getClass().getName());
    }

  }
}