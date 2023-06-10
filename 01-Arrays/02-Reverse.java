class Reverse {

    static void reverseArray(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 0, 1, 0, 3, 12 };

        reverseArray(arr);

        for (int x : arr) {
            System.out.println(x);
        }

    }
}
