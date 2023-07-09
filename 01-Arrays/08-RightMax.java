import static java.lang.Math.max;

class RightMax {
    public static void rightMax(int[] arr) {
        int[] rightMax = new int[arr.length];


        rightMax[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = max(arr[i], rightMax[i + 1]);
        }
        for (int a : rightMax) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 1, 2, 1, 5, 6, 5};

        rightMax(arr);
    }
}
