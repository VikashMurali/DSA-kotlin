package searchAlgorithms

/**
 * BinarySearch:
 * We use binary search to find if an element is present in any sorted array.
 * It can be sorted in ascending order descending order
 *
 * 1. Find the middle element
 * 2. If the target element is greater than middle element, search right to middle element
 * 3. Else search left to middle element
 * 4. If middle element equals target element -> return target element else return -1
 *
 * Time Complexity:
 * Best case - O(N)
 * Worst case - O(log N)
 */

fun main(){
    val arr = intArrayOf(1, 3, 4, 5, 7, 8, 12)
    print(binarySearchUsingRecursion(arr, 11, 0, arr.size - 1))
}

fun binarySearchUsingRecursion(arr: IntArray, target: Int, start: Int, end: Int): Int {
    if (start > end) return -1
    val mid = start + (end - start) / 2
    if(arr[mid] == target) return mid
    else if(arr[mid] < target) return binarySearchUsingRecursion(arr, target, mid + 1, end)
    return binarySearchUsingRecursion(arr, target, start, mid - 1)
}

fun binarySearch(arr: IntArray, target: Int): Int {
    var start = 0
    var end = arr.size - 1
    while(start <= end) {
        val mid = start + (end - start) / 2
        if(arr[mid] < target) start = mid + 1
        else if(arr[mid] >  target) end =  mid - 1
        else return mid
    }
    return -1
}

