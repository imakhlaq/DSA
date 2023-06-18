/**
 * 01-MinAndMax
 */
class MinAndMax {

    public static void minAndMax(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, -3, 1, 3, -2, 1, -5, 7, 2 };
        minAndMax(arr);

    }

}
