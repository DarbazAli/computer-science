package ConditionalsAndLoops;

/* 
    Writing if statements in java
    if ( <boolean expression> ) { <statements> }
    if the statement was just one, then the curlybrace is optinal

    if ( x > y ) max = x
    else max = y
*/

public class Flip {
    public static void main(String[] args) {
        // simulate a fair coin flip
        if (Math.random() < 0.5)
            System.out.println("Heads");
        else
            System.out.println("Tails");
    }
}
