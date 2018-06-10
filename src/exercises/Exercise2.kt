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

    println("PRINT NAMES BEGINNING WITH T")
    val namesStartingWithT = usersList
            .filter{it.name[0].toUpperCase() == 'T'}
            .map{it.name}
            // or you can use .map(User::name)

    println(namesStartingWithT)


    println("PRINT USERS WITH AGE INCLUDING BETWEEN 20 AND 100")
    val usersForAge = usersList
            .filter{it.age in 20 .. 100}
            .map{it.name}

    println(usersForAge)

    println("PRINT SURNAMES OF USERS WITH EVEN AGE SORTED ALPHABETICALLY AVOIDING DUPLICATES")
    val usersWithEvenAge = usersList
            .filter{it.age.rem(2) == 0}
            .map{it.surname}
            .sortedBy{it}
            .distinct()

    println(usersWithEvenAge)
}
