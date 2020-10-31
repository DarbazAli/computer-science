package ConditionalsAndLoops;

public class HarmonicNumber {
    public static void main(String[] args) {
        // Compute the nth harmonic number
        int n = Integer.parseInt(args[0]);
        double Hn = 0.0;

        for (int i = 1; i <= n; i++) {
            Hn += 1.0 / i;
        }

        System.out.println(Hn);

    }
}
