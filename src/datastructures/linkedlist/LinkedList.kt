package datastructures.linkedlist

class LinkedList {
    private var head: Node? = null

    data class Node(var value: Int, var next: Node? = null)

    //Reverse a Linked List
    fun reverseLinkedList() {
        var prev: Node? = null
        var current = head
        var next: Node? = current?.next
        while(current != null){
            current.next = prev
            prev = current
            current = next
            if(next != null) next = next.next
        }
        head = prev
    }

    // Insert at end
    fun insert(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    // Remove first occurrence of a value
    fun remove(value: Int) {
        if (head == null) return

        if (head?.value == value) {
            head = head?.next
            return
        }

        var current = head
        while (current?.next != null && current.next?.value != value) {
            current = current.next
        }

        if (current?.next != null) {
            current.next = current.next?.next
        }
    }

    // Print the linked list
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.value} -> ")
            current = current.next
        }
        println("null")
    }
}

fun main() {
    val l = LinkedList()
    for(i in 1..5) l.insert(i)
    l.printList()
    l.reverseLinkedList()
    l.printList()
}