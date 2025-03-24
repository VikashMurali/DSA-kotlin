package SortingAlgorirthms

/**
Insertion Sort:

For every index, put that index element at the current value in Left hand side.

*Time Complexity:
 * Best case - O(N)
 * Worst case - O(N^2)

 **/

fun main(){
    val arr = intArrayOf(3,16,4,2,5)
    print(insertionSort(arr).contentToString())
}

fun insertionSort(arr:  IntArray): IntArray {
    for(i in 0..arr.size - 2){
        for(j in i+1 downTo  1){
            if(arr[j] < arr[j - 1]){
                swap(arr, j, j-1)
            } else {
                break
            }
        }
    }
    return arr
}