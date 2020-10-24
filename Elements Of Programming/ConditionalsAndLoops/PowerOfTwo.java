package ConditionalsAndLoops;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int power = 1;
        int i = 0;

        if (n < 0 || n > 30) {
            System.out.println("Error: the number must be in range of 0 < n < 30");
        } else {
            while (i <= n) {
                System.out.println(i + " " + power);
                power *= 2;
                i++;
            }
        }

    }
}
