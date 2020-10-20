public class EX_1_2_3 {
    public static void main(String[] args) {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);

        System.out.println(!(a && b) && (a || b) || ((a && b) || !(a || b)));
    }
}
