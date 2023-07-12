fun subArraySumIs0(list: List<Int>): Boolean {

    //prefix sum Array
    val prefixSum = mutableListOf<Int>();

    prefixSum.add(list[0]);

    for (i in 1..<list.size) {
        prefixSum.add(list[i]);
    }

    //sort the array
    prefixSum.sort();

    //checking for repeating number or zero;
    for (i in 0..<prefixSum.size - 1) {

        if (prefixSum[i] == prefixSum[i + 1] || prefixSum[i] == 0) {
            return true;
        }

    }

    return false;
}

fun main() {
    val arr = listOf(2, 4, -3, 1, 3, -2, 1, -5, 7, 2);

    println(subArraySumIs0(arr));


}
