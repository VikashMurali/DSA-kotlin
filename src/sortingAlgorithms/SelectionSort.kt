package sortingAlgorithms


/**
 * Selection Sort:
 * Select an element and put it in the right index
 *
 * 1. Find the maximum element and put it in the right index
 * 2. swap the elements
 *
 * Time Complexity:
 * Best case -  O(N^2)
 * Worst case - O(N^2)
 *
 */
fun  main(){
    val arr = intArrayOf(3,16,4,2,5)
    selectionSortUsingRecursion(arr, arr.size , 0,0)
    print(arr.contentToString())
}

fun selectionSortUsingRecursion(arr: IntArray, r: Int, c: Int, max: Int) {
    if(r == 0) return
    else if(c < r)  {
        if(arr[c] > arr[max]) selectionSortUsingRecursion(arr, r, c+1, c)
        else selectionSortUsingRecursion(arr, r, c+1, max)
    }
    else {
        swap(arr, max, r-1)
        selectionSortUsingRecursion(arr, r-1, 0, 0)
    }
}


fun selectionSort(arr: IntArray): IntArray {
    for(i in arr.indices) {
        val last = arr.size - i - 1
        val maxIndex = getMaxIndex(arr, 0, last)
        swap(arr, maxIndex, last)
    }
    return arr
}

fun getMaxIndex(arr: IntArray, start: Int, end: Int): Int{
    var max = start
    for(i in start..end) {
        if(arr[max] < arr[i]){
            max = i
        }
    }
    return max
}
