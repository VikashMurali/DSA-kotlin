package datastructures

import java.util.*

//Balanced Parenthesis
fun main() {
    val s = "()[]{}"
    print(isBalanced(s))
}

//This will not work for Asymmetric values like -> (){}[]
fun tpApproach(expression: String): Boolean {
    var start = 0
    var end = expression.length - 1
    while(start < end) {
        if(matches(expression[start], expression[end])) {
            start ++
            end --
        } else {
            return false
        }
    }
    return true
}

fun isBalanced(expression: String): Boolean {
    val stack = Stack<Char>()
    for(char in expression) {
        when(char) {
            '(', '{', '[' -> stack.push(char)
            ')', '}', ']' -> {
                if(stack.isEmpty()) return false
                val top = stack.pop()
                if(!matches(top, char)) return false
            }
        }
    }
    return stack.isEmpty()
}

fun matches(open: Char, close: Char) = (open == '(' && close == ')'||
            open == '{' && close == '}'||
            open == '[' && close == ']')
