package exercises

data class User(var name: String, var surname: String, var age: Int)

fun main(args: Array<String>) {
    val usersList = listOf(
            User("Paperina", "Disney", 10),
            User("Black Widow", "Marvel", 23),
            User("Pluto", "Disney", 48),
            User("Harry", "Potter", 11),
            User("Ginny", "Potter", 10),
            User("James", "Potter", 40),
            User("Thor", "Marvel", 400),
            User("Tick", "Amazon", 52)
    )

    // PRINT NAMES BEGINNING WITH "T"
    println("NOPE!")


    // PRINT USERS WITH AGE INCLUDING BETWEEN 20 AND 100
    println("NOPE!")

    // PRINT SURNAMES OF USERS WITH EVEN AGE SORTED ALPHABETICALLY AVOIDING DUPLICATES
    println("NOPE!")
}
