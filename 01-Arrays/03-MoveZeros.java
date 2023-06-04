/**
 * 01-MinAndMax
 *
 * Ans= Keep track of non-zero and move all to the start and fill rest of array
 * with zero.
 */
class MoveZeros {

    static void moveZeros(int nums[]) {

        int location = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[location] = nums[i];
                location++;
            }
        }

        while (location < nums.length) {
            nums[location++] = 0;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 0, 0, 1, 0, 3, 12 };

        moveZeros(arr);

        for (int x : arr) {
            System.out.println(x);
        }

    }

}
