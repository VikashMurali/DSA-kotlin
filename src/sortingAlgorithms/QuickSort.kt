package sortingAlgorithms

/**
 * Quick Sort
 * 1. Choose pivot element, after 1st pass all the elements
 * < P will be on LHS of P
 * > P will be on RHS of P
 * After the pass, pivot element will be sorted in correct position
 *
 * Time Complexity:
 * Best case - O(N log N)
 * Worst case - O(N^2)
 *
 * 1. Quick sort is preferred for arrays over merge sort because it takes O(N) extra space
 * 2. For linkedLists - Merge sort is preferred
 */

fun main(){
    val arr = intArrayOf(13,6,49,29,7)
    quickSort(arr)
    print(arr.contentToString())
}

fun quickSort(arr: IntArray, low: Int =  0, high: Int = arr.size - 1){
    if(low >= high) return

    var s = low
    var e = high
    var m = s + (e - s) / 2
    val pivot = arr[m]

    while(s <= e){
        while(arr[s] < pivot) s++
        while(arr[e] > pivot) e--
        if(s <= e) swap(arr, s++, e--)
    }

    quickSort(arr, low, e)
    quickSort(arr, s, high)

}