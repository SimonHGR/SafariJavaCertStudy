package usingvar;

import java.io.FileInputStream;

public class Ex {
//  class A {
//    var x = 99;
//  }

//  void doStuffB(var x) { }

//  void doStuffC() {
//    var x;
//    x = 100;
//  }

  void doStuffD() {
    var x = 100;
  }

//  void doStuffE() {
//    var x = null;
//  }

  void xxx() throws Throwable {
//    var [] f = { 1,2,3 };

    var g = new int[]{ 1,2,3 };

//    var h1 = 10, h2 = 100;

    // java uses CONDITIONS (only) for "conditional compilation"
    var i = true ? "99" : 99;

//    int goto = 99; // NOPE, goto is a keyword

    var var = "var"; // context sensitive special identifier

    Iterable<String> ki = null;
    for (var k : ki) {}

//    try (var input = new FileInputStream("")) { // OK
//      if (Math.random() > 0.5) throw new SQLException();
//    } catch (var anException) {} // NOPE
  }
//  void var() {} // legal
}

//class var {} // not legal