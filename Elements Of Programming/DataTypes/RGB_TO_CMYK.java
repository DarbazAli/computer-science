package DataTypes;

public class RGB_TO_CMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        // white = max ( r / 255, g / 255, b / 255)
        double w = Math.max(Math.max(r / 255, g / 255), b / 255);
        double c = (w - (r / 255)) / w;
        double m = (w - (g / 255)) / w;
        double y = (w - (b / 255)) / w;
        double k = 1 - w;
        System.out.println(w);
        System.out.print(c);
        System.out.print(m);
        System.out.print(y);
        System.out.println(k);
    }
}
