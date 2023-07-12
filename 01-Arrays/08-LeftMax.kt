import kotlin.math.max

fun leftMax(list: List<Int>): List<Int> {

    val leftMax = mutableListOf<Int>();

    leftMax.add(list[0]);

    for (i in 1..<list.size) {
        leftMax.add(max(leftMax[i - 1], list[i]));
    }

    return leftMax;
}


fun main() {
    val arr = listOf(4, 2, 9, 1, 8, 5, 6, 3);

    println(leftMax(arr));
}
