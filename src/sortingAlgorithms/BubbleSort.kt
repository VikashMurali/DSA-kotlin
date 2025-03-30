package sortingAlgorithms

/**
 * Bubble Sort
 *
 * Compares each element with the other element and the inner loop sorts from the right
 *
 * Time Complexity:
 * Best case(when array is already sorted) - O(N)
 * Worst case - O(N^2)
 *
 * Space Complexity - O(1) (Na extra space required to copy the array)
 */
fun main(){
    val arr = intArrayOf(13,6,49,29,7)
    bubbleSortUsingRecursion(arr, arr.size - 1, 0)
    print(arr.contentToString())
}

fun bubbleSortUsingRecursion(arr: IntArray, r: Int, c: Int) {
    if(r == 0) return
    else if(c < r){
        if(arr[c] > arr[c+1]) swap(arr, c, c+1)
        bubbleSortUsingRecursion(arr, r, c+1)
    }
    else bubbleSortUsingRecursion(arr, r - 1, 0)
}

fun bubbleSort(arr: IntArray): IntArray {
    var swapped: Boolean
    for(i in 0..<arr.size - 1) {
        swapped = false
        for(j in 1..<arr.size - i){
            if(arr[j] < arr[j - 1]){
                swap(arr, j, j - 1)
                swapped = true
            }
        }
        if (!swapped) break
    }
    return arr
}

fun swap(arr: IntArray, i: Int, j: Int){
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}