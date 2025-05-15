package datastructures

class List {

    /**
     * 1. Immutable Lists (Read-Only)
     * These lists cannot be modified after creation.
     */
    fun immutableList() {
        val immutableList = listOf(1,2,3,4,5)
        print(immutableList)
    }

    /**
     * 2. Mutable Lists
     * These lists allow modifications such as adding, updating, and removing elements.
     **/
    fun mutableList() {
        val mutableList =  mutableListOf(1,2,3,4)
        mutableList.add(5)
        print(mutableList)
    }

    /**
     * 3. ArrayList
     * A resizable array-based implementation of MutableList, similar to Java’s ArrayList.
     */
    fun arrayList() {
        val arrayList = arrayListOf("A", "B", "C")
        arrayList.add("D")
        print(arrayList)
    }
}

fun main() {
    val l = List()
    l.arrayList()
}