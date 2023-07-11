import java.util.Arrays;

import static java.util.Collections.reverse;

class Rotate90 {
    public static void rotate90(Integer[][] arr) {

        //transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse each matrix
        for (int i = 0; i < arr.length; i++) {
            reverse(Arrays.asList(arr[i]));
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {

        Integer[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotate90(arr);
    }
}
