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
    print(linearSearchUsingRecursion(arr, 17))
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