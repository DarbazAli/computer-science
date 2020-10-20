public class EX_1_2_16 {
    public static void main(String[] args) {
        double G = Double.parseDouble(args[0]);
        double M1 = Double.parseDouble(args[1]);
        double M2 = Double.parseDouble(args[2]);
        double r = Double.parseDouble(args[3]);

        double force = (G * M1 * M2) / (r * r);

        System.out.println(force);
    }
}
