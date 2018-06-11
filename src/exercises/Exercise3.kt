package exercises

// PART 1: Implement a binary tree
// A binary tree is made up of nodes which are objects
// with a left child node, a right child node and a Int value.
// If a node is missing one of the two children, make that child a null
data class Node(
        val value: Int,
        val leftChild: Node? = null,
        val rightChild: Node? = null
)

fun main(args: Array<String>) {
    // PART 2: Build a binary search tree
    // Build the following binary tree
    //              10
    //           5      15
    //         2   6  X    18

    val tree = Node(10,
            Node(5,
                    Node(2),
                    Node(6)
            ),
            Node(15, rightChild = Node(18))
    )

    // PART 3: Print a node
    // Write a function printNode that prints a node's representation
    // Print the tree as sequence of numbers beginning from the smallest value,
    printNode(tree)
    println()

    // (GDG PISA BONUS) PART 4: SUM-TREE
    // Infix extension function

    // write an infix extension function
    // that links two nodes with a superNode containing the min value of the child

    // Node(2) minTree Node(3)
    //
    //     2
    //  2     3

    val leftChild = Node(1)
    val rightChild = Node(3)
    val minTree = leftChild minTree rightChild

    printNodeSmarter(minTree)

}

fun  printNode(tree: Node?) {
    if (tree != null) {
        printNode(tree.leftChild)
        print("${tree.value}, ")
        printNode(tree.rightChild)
    }
}

// let  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/let.html
// with https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/with.html
fun  printNodeSmarter(tree: Node?) {
    with(tree) {
        this?.let {
            printNodeSmarter(leftChild)
            print("$value, ")
            printNodeSmarter(rightChild)
        }
    }
}

infix fun Node.minTree(right: Node):Node{
    val min = if (this.value < right.value)
        this.value
    else
        right.value

    return Node(min, this, right)
}
