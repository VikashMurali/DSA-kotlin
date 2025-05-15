package datastructures.tree

class BinaryTree{
    lateinit var root: Node

    class Node(val value: Int, val left: Node, val right: Node)
}