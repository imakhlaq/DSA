class Spiral {

    public static void printInSpiral(int[][] arr) {

        int left = 0;
        int right = arr[0].length;
        int top = 0;
        int down = arr.length;

        int dir = 0;


        while (top < down && left < right) {


        }

    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printInSpiral(arr);

    }
}
