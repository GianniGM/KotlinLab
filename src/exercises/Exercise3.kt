package exercises

// 1. Implement a binary tree
// A binary tree is made up of nodes which are objects
// with a left child node, a right child node and a Int value.
// If a node is missing one of the two children, make that child a null
data class Node(
    val value: Int,
    val leftChild: Node? = null,
    val rightChild: Node? = null
)

// Reserved space for exercise 3
fun  printNode(tree: Node?) {
    if (tree != null) {
        printNode(tree.leftChild)
        print("${tree.value}, ")
        printNode(tree.rightChild)
    }
}

// Reserved space for exercise 4


fun main(args: Array<String>) {
    // 2. Build a binary tree
    // Using the Node class you built, build the following binary tree
    //              10
    //           5      15
    //         2   6  X    18
    // and store it in a val called "tree"

    val tree = 
        Node(10,
            Node(5,
                Node(2),
                Node(6)
            ),
            Node(15,
                rightChild = Node(18))
        )

    // PART 3: Print a node
    // Write a function "printNode" that prints an the values in an ordered
    // binary tree (which means it should print from the lowest value stored to the highest)
    // (hint: recursion)
    // Expected output would be 2 5 6 10 15 18
    // [Write the function in the allotted space on top of the file]
    printNode(tree)


    // (GDG PISA BONUS) PART 4: SUM-TREE
    // Infix extension function
    // write an infix extension function that takes two Nodes as input and
    // returns a Node that has:
    // - the first of the two as left child
    // - the second of the two as right child
    // - the minimum value of the two as value
    // [Write the function in the allotted space on top of the file]

    // e.g.: Node(2) minTree Node(3)
    //
    //     2
    //  2     3

}

// also, you may want to look up "let" and "with"
// let  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/let.html
// with https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/with.html
