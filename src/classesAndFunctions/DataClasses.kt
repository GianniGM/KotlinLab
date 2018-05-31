package classesAndFunctions

/*  NOTE:
 *  data class provides a class with built-in method
 *  setters and getters
 *
 *  toString() => convert in a string
 *  equals() => used directly by == operator
 *  hashCode() => provides an hashCode()
 *  copy() => method to copy an object
 *  componentN() functions used for destructuring operator
 *
 *  further information: https://bit.ly/2L7yxs6 */
data class Developer( //constructor

        //fields with getters
        val userName: String,
        val age: Int,
        val gender: String,

        //fields with getters and setters
        var isOnline: Boolean = false
)

fun main(args: Array<String>) {
    val greetingsList = greetings()
    println(greetingsList)
}

private fun greetings(): String {
    //todo: for a better performance of map, filter, sortedBy check Kotlin Sequences

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