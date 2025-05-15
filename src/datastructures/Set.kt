package datastructures

class Set {

    /**
     * 1. Immutable (Read-Only) Set
     * This is a set that cannot be modified after creation.
     *
     * Set<T> – A standard read-only set.
     */
    fun immutableSet() {
        val immutableSet = setOf(1, 2, 3, 4)
        println(immutableSet.contains(2))
        print(immutableSet)
    }

    /**
     * 2. Mutable Set
     * This set allows adding and removing elements.
     *
     * MutableSet<T> – A modifiable set.
     */
    fun mutableSet() {
        val mutableSet = mutableSetOf("A", "B", "C")
        mutableSet.add("D")   // Add element
        mutableSet.remove("B")
    }

    /**
     * 3. HashSet
     * A set backed by a hash table.
     * It offers fast lookup, insertion, and deletion (average O(1) time complexity).
     * It eliminates duplicate elements
     */
    fun hashSet() {
        val hashSet = hashSetOf(1,2,3)
        hashSet.add(4)
        hashSet.add(4)
        print(hashSet)
    }

    /**
     * 4. SortedSet (TreeSet in Java)
     * Maintains elements in a sorted order (default: ascending).
     *
     * Uses Red-Black Tree, so operations like add(), remove(), and contains() run in O(log n) time.
     */
    fun sortedSet() {
        val sortedSet = sortedSetOf<Int>()
        sortedSet.add(3)
        sortedSet.add(1)
        sortedSet.add(2)
        println(sortedSet)
    }

}

fun main()  {
    val s = Set()
    s.sortedSet()
}