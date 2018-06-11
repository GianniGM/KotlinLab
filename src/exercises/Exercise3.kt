package exercises

// PART 1: Implement a binary tree
// A binary tree is made up of nodes which are objects
// with a left child node, a right child node and a Int value.
// If a node is missing one of the two children, make that child a null

data class Node(
        // Fill this in
        val value: Int,
        val leftChild:  Node?,
        val rightChild: Node?
)

fun main(args: Array<String>) {
    // PART 2: Build a binary tree
    // Build the following binary tree
    //              10
    //           5      15
    //         2   6  X    18
    val node2  = Node(2, null, null)
    val node6  = Node(6, null, null)
    val node18 = Node(18, null, null)
    val node5  = Node(5, node2, node6)
    val node15 = Node(15, null, node18)
    val node10 = Node(10, node5, node15)

    // PART 3: Print a node
    // Write a function printNode that prints a node's representation
    // If you print the node 10 you should get:
    //   10
    // 5   15

    // If you print the node 15 you should get:
    //   15
    // _   18

    // (BONUS) PART 4: Infix extension function
    // Write an infix extension function that creates a node given two nodes.
    // The function should be used like this node5 10.makeNode node15

}

fun printNode(node: Node) {
    println(node.value)
    println("${node.leftChild?.value ?: "_"}  ${node.rightChild?.value ?: "_"}")
}