import kotlin.math.max

fun rightMax(list: List<Int>): IntArray {

    val rightMaxList = IntArray(list.size);

    rightMaxList[list.size - 1] = list[list.size - 1];

    var i = list.size - 2;

    while (i >= 0) {
        rightMaxList[i] = max(rightMaxList[i + 1], list[i])
        i--;
    }

    return rightMaxList;
}


fun main() {
    val arr = listOf(4, 2, 9, 1, 8, 5, 6, 3);

    val intArr: IntArray = rightMax(arr)

    for (i in intArr) {
        println(i);
    }

}
