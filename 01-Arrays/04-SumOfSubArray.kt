/*
 calculate the sum for all sub array that start from 0 to N (prefix Sum array)
 and subtract the end - start-1


O(n+q)
 */

fun prefixSum(list: List<Int>): List<Int> {
    val prefixSum = mutableListOf<Int>();

    prefixSum.add(list[0]);

    for (i in 1..<list.size) {

        prefixSum.add(list[i] + prefixSum[i - 1]);
    }

    return prefixSum;
}


fun main() {
    val arr = listOf(3, 6, 12, 1, 2, 5, 7, 8, 9)

    val sumOfArrayN = prefixSum(arr)

    var q = 4;
    while (q >= 0) {

        val (start, end) = readln().split(' ').map { it.toInt() }

        //End-start-1(because of Prefix Sum Array);

        val ans = sumOfArrayN[end] - sumOfArrayN[start - 1];

        print(ans);

        q--;

    }

}
