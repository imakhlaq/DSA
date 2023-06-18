
class MySqrt{
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Use long to avoid integer overflow

            if (square == x) {
                return mid;
            } else if (square > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }


    public static void main(String[] args) {

        mySqrt(4);

    }
}
