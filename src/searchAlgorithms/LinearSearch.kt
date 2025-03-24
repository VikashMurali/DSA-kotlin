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
    val arr = intArrayOf(5, 8, 2, 0, 3, 9, 7)
    print(linearSearch(arr, 5))
}

fun linearSearch(arr: IntArray, target: Int): Int {
    for(i in arr.indices){
        if(arr[i] == target) {
            return i
        }
    }
    return -1
}