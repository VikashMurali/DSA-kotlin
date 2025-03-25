package sortingAlgorithms

/**
 * Cyclic Sort:
 * When numbers are from 1 to n, use cyclic sort
 *
 * 1. Take the first element and find the correct index value of that element
 * 2. If element not in correct index swap the elements
 * 3. Else increment i
 *
 * Time Complexity - O(N)
 * Space Complexity - O(1)
 */

fun main() {
    val arr = intArrayOf(3,1,4,5,2)
    print(cyclicSort(arr).contentToString())
}

fun cyclicSort(arr: IntArray): IntArray {
    var i = 0
    while(i < arr.size) {
        val correctIndex = arr[i] - 1
        if(arr[i] != arr[correctIndex]) swap(arr, i, correctIndex)
        else i++
    }
    return arr
}

