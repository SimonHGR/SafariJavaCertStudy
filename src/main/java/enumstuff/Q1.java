package enumstuff;

interface GameDescriptor {
  String gameType();
}

abstract class GD {
  public abstract String gameType();
}

enum Suit implements GameDescriptor {
  HEARTS, DIAMONDS, CLUBS, SPADES;
  // line n1
  public String gameType() { return "Cards"; }
  boolean isTrumps() { return this == HEARTS; }
}

public class Q1 {
}
