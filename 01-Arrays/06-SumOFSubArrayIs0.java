import static java.util.Arrays.sort;

class SumOfSubArrayIsZero {

    public static boolean isZero(int[] arr) {
        boolean isZero = false;

        int[] prefix = new int[arr.length - 1];
        prefix[0] = arr[0];

        //creating prefix sum
        for (int i = 1; i < arr.length - 1; i++) {
            int newPrefix = prefix[i - 1] + arr[i];
            prefix[i] = newPrefix;
        }

        //sorting it
        sort(prefix);

        //checking for repeating or 0 in array
        for (int i = 0; i < prefix.length - 1; i++) {

            if (prefix[i] == prefix[i + 1] || prefix[i] == 0) {
                isZero = true;
                break;
            }

        }
        return isZero;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4};

        System.out.println(isZero(arr));
    }
}
