package ConditionalsAndLoops;

public class HarmonicNumber {
    public static void main(String[] args) {
        // Compute the nth harmonic number
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            // ...
            sum += 1.0 / i;
        }

        // print the number
        System.out.println(sum);
    }
}
