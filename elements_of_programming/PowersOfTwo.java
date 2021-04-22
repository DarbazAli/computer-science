package elements_of_programming;

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int power = 1;

        while (power <= n / 2) {
            System.out.println(power);
            power = 2 * power;
        }
    }
}
