package Arrays;

public class RandomValues {
    public static void main(String[] args) {
        int n = 10;

        // create a new array with n length
        double[] randoms = new double[n];
        for (int i = 0; i < n; i++) {
            randoms[i] = Math.random();
        }

        // print out the all elements inside randoms array
        for (int i = 0; i < randoms.length; i++) {
            System.out.println(i + " " + randoms[i]);
        }
    }
}
