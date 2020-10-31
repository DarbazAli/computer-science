package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 110.0;
        arr[1] = 9.0;
        arr[2] = 8.0;
        arr[3] = 20.0;
        arr[4] = 7.0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            double temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - i - 1] = temp;
        }

        // print out reversed array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
