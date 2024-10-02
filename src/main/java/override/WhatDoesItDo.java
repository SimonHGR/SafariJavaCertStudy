package override;

public class WhatDoesItDo {
  private String myName;

  public WhatDoesItDo(String myName) {
    this.myName = myName;
  }

  @Override
  public String toString() {
    return "I'm called " + myName;
  }

  public static void main(String[] args) {
    WhatDoesItDo w = new WhatDoesItDo("Inaya");
    System.out.println(w);

  }
}
