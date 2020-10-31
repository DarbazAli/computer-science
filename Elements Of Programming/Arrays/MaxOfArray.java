package Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 110.0;
        arr[1] = 9.0;
        arr[2] = 8.0;
        arr[3] = 20.0;
        arr[4] = 7.0;

        double max = Double.NEGATIVE_INFINITY;

        // loop through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max is equal to " + max);

    }
}
