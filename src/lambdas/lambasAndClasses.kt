package lambdas

import dataClasses.Developer

fun main(args: Array<String>) {
    val list = generateUsersList()
    val greetingsList = greetings(list)
    println(greetingsList)
}

fun generateUsersList() = listOf(
        Developer("Larry", 28, "male"),
        Developer("Sibo", 37, "male"),
        Developer("Michele", 22, "male"),
        Developer("MJ", 20, "female"),
        Developer("Leo", 22, "male"),
        Developer("Harry Potter", 12, "Vingardium Leviosa")
)

private fun greetings(developersList:List<Developer>): String {
    // note: for a better performance of: map, filter, sortedBy in large collections
    // check Kotlin Sequences

    return developersList
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
