import java.util.LinkedList

fun minAndMax(list: List<Int>): List<Int> {

    var min = Int.MAX_VALUE;
    var max = Int.MIN_VALUE;

    val ans = mutableListOf<Int>()
    

    for (i in list) {
        if (i > max) {
            max = i;
        }
        if (i < min) {
            min = i;

        }
    }
    ans.add(min);
    ans.add(max);

    return ans;

}


fun main() {
    val arr = listOf(1, 2, 3, 4, 5, 6, 7, 88, 9);

    println(minAndMax(arr))
}
