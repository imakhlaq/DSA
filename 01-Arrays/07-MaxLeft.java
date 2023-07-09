import static java.lang.Math.max;

class MaxLeft {

    public static void maxLeft(int[] arr) {

        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = max(arr[i], leftMax[i - 1]);

        }

        for (int a : leftMax) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 2, 1, 5, 6, 5};

        maxLeft(arr);
    }
}
