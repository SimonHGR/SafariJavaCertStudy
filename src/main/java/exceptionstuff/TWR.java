package exceptionstuff;

import java.io.FileReader;

public class TWR {
  public static void main(String[] args) throws Throwable {
//    FileReader fr = new FileReader("Data.txt");
    FileReader fr = null;
    try {
      fr = new FileReader("Data.txt");
//      FileReader fr = new FileReader("Data.txt");
      fr.read();
      System.out.println("Stuff");
//      fr.close();
    } finally {
      if (fr != null) {
        try {
          fr.close();
        } catch (Exception e) {
        }
      }
    }
    FileReader fr2 = new FileReader("data.dat");
    try (
        FileReader fr1 = new FileReader("data.dat");
        fr2;
        ) {
//      fr1 = null;
    } // compiler has built catch and finally
    fr2.close();
  }
}
