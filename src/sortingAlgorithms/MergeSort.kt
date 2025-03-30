package sortingAlgorithms

import java.util.*

/**
 * Merge Sort
 *
 * Using recursion to divide the problem into smaller sub-problems and conquering it.
 *
 * 1. Divide array into 2 parts
 * 2. Get both parts sorted via recursion
 * 3. Merge the sorted parts
 *
 * Time Complexity: O(N * log N)
 * Space Complexity: O(N)
 *
 */

fun main() {
    val arr = intArrayOf(13,6,49,29,7)
    mergeSortInPlace(arr)
    print(arr.contentToString())
}

fun mergeSort(arr: IntArray): IntArray {
    if(arr.size == 1) return arr
    val mid = arr.size / 2
    val left = mergeSort(arr.copyOfRange(0, mid))
    val right = mergeSort(arr.copyOfRange(mid, arr.size))
    return merge(left, right)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    var mix = IntArray(left.size + right.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) mix[k++] = left[i++]
        else mix[k++] = right[j++]
    }

    while(i < left.size) mix[k++] = left[i++]

    while(j < right.size) mix[k++] = right[j++]

    return mix
}

//Merge sort without other arrays
fun mergeSortInPlace(arr: IntArray, start: Int = 0, end: Int = arr.size) {
    if(end - start <= 1) return
    val mid = (start + end) / 2
    mergeSortInPlace(arr, start, mid)
    mergeSortInPlace(arr, mid, end)

    mergeInPlace(arr, start, end, mid)
}

fun mergeInPlace(arr: IntArray, start: Int, end: Int, mid: Int) {
    var mix = IntArray(end - start)
    var i = start
    var j = mid
    var k = 0

    while (i < mid && j < end) {
        if (arr[i] < arr[j]) mix[k++] = arr[i++]
        else mix[k++] = arr[j++]
    }

    while(i < mid) mix[k++] = arr[i++]

    while(j < end) mix[k++] = arr[j++]

    for(m in mix.indices){
        arr[start + m] = mix[m]
    }
}