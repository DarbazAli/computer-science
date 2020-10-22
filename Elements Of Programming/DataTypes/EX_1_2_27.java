package DataTypes;

public class EX_1_2_27 {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double r = Math.sin(2 * Math.PI * v) * (Math.pow(-2 * Math.log(u), 1 / 2));

        System.out.println(r);
    }
}
