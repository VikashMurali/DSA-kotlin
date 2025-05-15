package searchAlgorithms

/**
 * Linear Search:
 * Finding the index of a target element in the array
 * 1. Run a loop to search if the element equals target element
 *
 * Time Complexity:
 * Best case - O(1)
 * Worst case - O(N)
 *
 */

fun main() {
    val arr = arrayOf(
        intArrayOf(4, 6, 8, 2),
        intArrayOf(44, 66, 18, 32),
        intArrayOf(14, 12),
    )
    print(linearSearchIn2DArray(arr, 46).contentToString())
}

fun linearSearchUsingRecursion(arr: IntArray, target: Int, index: Int = 0): Int {
    if(index == arr.size) return -1
    else if(arr[index] == target) return index
    return linearSearchUsingRecursion(arr, target, index + 1)
}

fun linearSearch(arr: IntArray, t: Int): Int{
    if(arr.isEmpty()) {
        return -1
    }
    arr.forEachIndexed { index, i ->
        if(i==t){
            return index
        }
    }
    return -1
}

fun linearSearchIn2DArray(arr: Array<IntArray>, target: Int): IntArray {
    arr.forEachIndexed { rowIndex, rowValue ->
        rowValue.forEachIndexed { colIndex, colValue ->
            if(colValue == target) return intArrayOf(rowIndex, colIndex)
        }
    }
    return intArrayOf(-1, -1)
}