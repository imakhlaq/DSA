import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TappingRainWater {

    public static int maxWater(Integer[] arr) {

        //find the left max array
        List<Integer> leftMax = new ArrayList<>();
        leftMax.add(0, arr[0]);

        for (int i = 1; i < arr.length; i++) {

            leftMax.add(i, Math.max(leftMax.get(i - 1), arr[i]));
        }

        System.out.println(leftMax);

        //find the right max array
        //initial fixed size List
        List<Integer> rightMax = new ArrayList<>(Arrays.asList(new Integer[arr.length - 1]));

        rightMax.add(arr.length - 1, arr[arr.length - 1]);

        for (int i = rightMax.size() - 2; i >= 0; i--) {

            rightMax.set(i, Math.max(arr[i], rightMax.get(i + 1)));

        }
        System.out.println(rightMax);

        //calculate water level

        List<Integer> waterLevl = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            waterLevl.add(Math.min(leftMax.get(i), rightMax.get(i)) - arr[i]);
        }

        System.out.println(waterLevl);

        return waterLevl.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3};

        System.out.println(maxWater(arr));
    }
}
