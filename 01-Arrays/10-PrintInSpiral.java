class Spiral {

    public static void printInSpiral(int[][] arr) {

        int left = 0;
        int right = arr[0].length - 1;
        int top = 0;
        int down = arr.length - 1;

        int dir = 0;


        while (top <= down && left <= right) {

            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.println(arr[top][i]);

                }
                top++;
            }

            if (dir == 1) {
                for (int j = top; j <= down; j++) {
                    System.out.println(arr[j][right]);

                }
                right--;
            }

            if (dir == 2) {
                for (int k = right; k >= left; k--) {
                    System.out.println(arr[down][k]);

                }
                down--;

            }

            if (dir == 3) {
                for (int p = down; p >= top; p--) {
                    System.out.println(arr[p][left]);

                }
                left++;
            }


            dir = (dir + 1) % 4;
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
