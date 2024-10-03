package sealedstuff;

import java.io.Serializable;

// extends first, implements second... permits last
//class Thing implements Serializable extends Object {}

interface ArbInter {}
final class Y implements X {}
sealed interface X
    /*permits Y extends ArbInter -- wrong order!!!*/
    /*permits Y, Z*/
    /*permits Y*//* point x */{}

// line n1
///*non-sealed*/ class Z implements X {}
//record Z() implements X {}
//enum Z implements X {}
//non-sealed abstract class Z implements X permits Q {}
//final class Q extends Z {}

public class Question {
}
