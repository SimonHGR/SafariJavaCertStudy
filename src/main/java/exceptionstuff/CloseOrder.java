package exceptionstuff;

import java.io.IOException;
import java.sql.SQLException;

class AC3 implements AutoCloseable {
  private static int nextId = 1;
  private int myId = nextId++;

  @Override
  public void close() throws Exception {
    System.out.println("Closing " + myId);
    throw new SQLException("Exception from id " + myId);
  }
}

public class CloseOrder {
  public static void main(String[] args) throws Throwable {

    try (
        var one = new AC3();
        var two = new AC3();
    ) {
      if (Math.random() > 0.5) {
        throw new IOException("File messed up");
      }
      System.out.println("finishing up normal execution");
    } // BUNCHES OF GENERATED CODE HERE!!!
    // THIS CODE CALLS THE CLOSE METHODS
  }
}
