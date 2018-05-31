package exercises

data class User(var name: String, var surname: String, var age: Int)

fun main(args: Array<String>) {
    val list = listOf(
            User("Paperina", "Disney", 10),
            User("Lalla", "Marvel", 23),
            User("Pluto", "Disney", 48),
            User("Harry", "Potter", 11),
            User("James", "Potter", 40),
            User("Thor", "Marvel", 400),
            User("Tick", "Amazon", 52)
    )

    println("PRINT USERNAMES BEGINNING WITH T")

    println("PRINT USERS WITH AGE INCLUDING BETWEEN 20 AND 100")

    println("PRINT SURNAMES (AVOID DUPLICATIONS) AGE OF EVEN NUMBER")
}