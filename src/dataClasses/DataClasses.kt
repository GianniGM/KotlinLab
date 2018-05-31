package dataClasses

fun main(args: Array<String>) {
    val greetingsList = greetings()
    println(greetingsList)
}

private fun greetings(): String {
    // note: for a better performance of: map, filter, sortedBy in large collections
    // check Kotlin Sequences

    return generateUsersList()
            .filter { it.age in 10..23 }
            .sortedBy { it.age }
            .map {
                when (it.gender) {
                    "female" -> "Hi Lady ${it.userName}"
                    "male" -> "Hi Man ${it.userName}"
                    else -> "Hi Dear ${it.userName}"
                }
            }
            //reduce all user values in a string
            .reduce { acc, s -> "$acc, $s" }
}

fun generateUsersList() = listOf(
        Developer("Larry", 28, "male"),
        Developer("Sibo", 37, "male"),
        Developer("Lalla", 22, "female"),
        Developer("MJ", 20, "female"),
        Developer("Harry Potter", 12, "Vingardium Leviosa")
)