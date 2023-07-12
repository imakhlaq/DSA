import java.util.*;

class FindMissingAndDublicate {

    public static List<Integer> missingAndDublicate(Integer[] arr) {

        //for ans
        List<Integer> ans = new ArrayList<>();

        //dublicate
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] < 0) {

                ans.add(arr[i]);
            } else {
                
                arr[Math.abs(arr[i]) - 1] = -1 * arr[Math.abs(arr[i]) - 1];
            }
        }

        System.out.println(Arrays.asList(arr));

        //missing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);

            }
        }


        return ans;
    }

    public static void main(String[] args) {


        // List<Integer> arr = Arrays.asList(1, 2, 3, 3, 5, 6, 7);


        Integer[] arr = {2, 3, 1, 2};

        List<Integer> res = missingAndDublicate(arr);

        System.out.println(res);

    }
}
