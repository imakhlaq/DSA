import java.util.Collections.swap


//O(n)
fun reverseSubArray(list: List<Int>, start: Int, end: Int) {

    var start1 = start;
    var end1 = end;

    while (start1 < end1) {

        swap(list, start1, end1);
        start1++;
        end1--;
    }

}


fun main() {
    val arr = mutableListOf(3, 2, 7, 9, 12, 6, 8, 4, 1);

    println(arr)
    reverseSubArray(arr, 2, 4);
    println(arr)
}
