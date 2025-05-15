package datastructures

class Map {
    fun immutableMap() {
        val immutableMap = mapOf(1 to "One", 2 to "Two")
        print(immutableMap)
    }

    fun mutableMap() {
        val mutableMap = mutableMapOf(1 to "One", 2 to "Two")
        mutableMap[3] = "Three"
        print(mutableMap)
    }

    /**
     * 3. HashMap
     * Unordered collection with O(1) average time complexity for lookups and updates.
     *
     * Backed by a hash table.
     */
    fun hashMap() {
        val hashMap = hashMapOf("Ford" to "Mustang", "Tesla" to "Model S")
        hashMap["BMW"] = "M3"
        print(hashMap)
    }

    /**
     * 4. LinkedHashMap
     * Maintains insertion order.
     *
     * Uses doubly linked list along with a hash table.
     */
    fun linkedHashMap() {
        val linkedHashMap = linkedMapOf(3 to "Three", 2 to "Two", 1 to "One")
        println(linkedHashMap)
    }

    /**
     * 5. Sorted Map
     * Maintains elements in sorted order of keys.
     */

    fun sortedMap() {
        val sortedMap = sortedMapOf(3 to "Three", 2 to "Two", 1 to "One")
        for ((key, value) in  sortedMap) {
            println("$key -> $value")
        }
    }
}

fun main()  {
    val m = Map()
    m.sortedMap()
}