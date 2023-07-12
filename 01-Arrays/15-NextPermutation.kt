import java.util.Collections.swap

fun reverse(arr: List<Int>, start: Int, end: Int) {

    var start1 = start;
    var end1 = end;

    while (start1 <= end1) {

        swap(arr, arr[start], arr[end]);

        start1++;
        end1--;
    }
}

fun justGreater(arr: List<Int>): List<Int> {

    var i = arr.size - 2;
    var index = 0;

    //find the first smallest element from right
    //if permutaionis not possible i will be -1
    while (i >= 0) {

        if (arr[i] < arr[i + 1]) {
            break
        }
        i--;
    }

    //find the just greater value i == arr.size and replace
    if (i >= 0) {

        var j = arr.size - 1;
        while (i < j) {

            if (arr[j] > arr[i]) {
                break
            }
            j--;
        }
        swap(arr, arr[i], arr[j]);
    }


    if (i >= 0) {

        reverse(arr, i + 1, arr.size - 1)
    } else {
        reverse(arr, i + 1, arr.size - 1)
    }

    return arr;

}

fun main() {
    val arr = mutableListOf(2, 3, 2, 1);

    println(justGreater(arr));

}
