public class EX_1_2_24 {
    public static void main(String[] args) {
        // A = Math.power(Pe, rt)
        // A = Pe^rt
        // A = P * Math.power(e, r*t)

        int P = Integer.parseInt(args[0]);
        double r = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);

        double A = P * Math.pow(Math.E, r * t);
        System.out.println(A);
    }
}
