import static java.lang.Math.max;

class PickCard {

    public static int pickCard(int[] arr, int noCards) {

        int sum = 0;
        int max1 = 0;

        for (int i = 0; i < noCards; i++) {
            sum += arr[i];
        }
        max1 = sum;
        int j = arr.length - 1;

        for (int i = noCards - 1; i >= 0; i--) {
            sum = sum + arr[j] - arr[i];
            max1 = max(sum, max1);
            j--;
        }
        return max1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 1};

        System.out.println(pickCard(arr, 3));
    }
}
