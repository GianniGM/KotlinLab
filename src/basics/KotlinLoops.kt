package basics

fun main(args: Array<String>) {
    lists()
    mutableList()
    arrays()
    whileLoop()
    forLoops()
}

fun lists(): Unit {
    //immutableList you can't modify this list
    val immutableList = listOf("cannoli", "arancine")

    //you can create new list with a new value using plus instead
    val newImmutableList = immutableList.plus("scacce")
    println("immutableList is $immutableList updated with another list with a new value_ $newImmutableList")
}

fun mutableList():  Unit {
    // or you can use a mutableList
    // NOTE: mutableList is val, why??
    val mutableList = mutableListOf("cinghiale", "panzanella")
    mutableList.add("torta coi bischeri")

    println("mutableList: $mutableList")
}

fun arrays() {
    //you can create an array
    val array = Array(5, { index -> index * 2 })
    array[2] = 255
    println(array.toList())

    //todo: differences between arrays and mutableLists: https://bit.ly/2LL7kws
}

private fun whileLoop() {
    //mutable variables and while loop
    var incrementer = 5

    print("incrementer: $incrementer")
    while (incrementer <= 12) {
        incrementer += 2
        print("$incrementer, ")
    }
    println()
}

private fun forLoops() {
    //lists and foor-loops
    val items = listOf("cannoli", "cassate", "pasta di mandorle", "cioccolato modicano")

    //iterating over a list
    for (item in items)
        print("$item, ")
    println()

    //iterating over a list getting the index and its value
    for ((index, element) in items.withIndex())
        print("index $index contains $element, ")
    println()

    // for(index = 5; i <= 12; i+=2)
    for (index in 5..12 step 2)
        print("$index, ")
    println()

    // for(index = 5; i < 12; i++)
    for (index in 5 until 12)
        print("$index, ")
    println()

    // for(index = 12; i >= 5; i--)
    for (index in 12 downTo 5)
        print("$index, ")
    println()

    // for(index = 12; i >= 5; i-=2)
    for (index in 12 downTo 5 step 2)
        print("$index, ")

    println()
}
