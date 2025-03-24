package searchAlgorithms

/**
 * Binary Search in a two-dimensional array
 *
 * 1. Start with first row and last column
 * 2. Increment row till size of the array and decrement column
 * 3. If element is less than target increment row
 * 4. If element is greater than target decrement column
 * 5. Else return new array of row and column index
 * 6. If the element is not found after iterating through the loop return [-1, -1]
 *
 */

fun main(){
    val arr = arrayOf(
        intArrayOf(10, 140, 185),
        intArrayOf(21, 204, 206),
        intArrayOf(45, 437, 485)
    )

    println(binarySearch2DArray(arr, 45).contentToString())
}

fun binarySearch2DArray(arr: Array<IntArray>, target: Int): IntArray{
    var row = 0
    var col = arr.size - 1

    while (row < arr.size && col >= 0){
        if(arr[row][col] < target) row++
        if(arr[row][col] > target) col--
        else return intArrayOf(row, col)
    }

    return intArrayOf(-1, -1)
}