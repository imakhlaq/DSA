class FindMissing {
    public static int findMissing(int[] arr) {

        int n = arr.length + 1;

        //sum of n natural no
        int sumOfNaturalNumber = n * (n + 1) / 2;

        int sumOfArray = 0;

        //sum of array
        for (int j : arr) {
            sumOfArray += j;
        }
   
        return sumOfNaturalNumber - sumOfArray;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};

        System.out.println(findMissing(arr));
    }
}
