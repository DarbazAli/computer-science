package ConditionalsAndLoops;

public class TenHellos {
    public static void main(String[] args) {

        // initialize a separate variable
        int i = 1;

        // create a loop statement
        // check if i is less than or equal to 10
        // if the condition is true, the prgram will execute the statement block again
        // and again
        while (i <= 10) {
            // execute this line of code, if the condition is true
            System.out.println(i + "th Hello");

            // increment the value of i by 1, this is to keep track of the condition state
            // if i == 11, then, the condition will be false, and the program stops
            // executing any block of code
            i++;
        }
    }
}
