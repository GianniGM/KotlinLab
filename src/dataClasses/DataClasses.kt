package dataClasses

data class User(
        val userName: String,
        var age: Int,
        val gender: String,
        var isOnline: Boolean = false
)

fun main(args: Array<String>) {

    val user = User("Larry", 28, "male")

    //copy provided by data class
    val userCopied = user.copy()
    println(userCopied)
    println("user and userCopied are equals: ${user == userCopied}")

    //new object: with different pointer but same values
    val user2 = User("Larry", 28, "male")
    println("user and user2 are equals: ${user == user2}")

    user2.isOnline = true
    user2.age = 32
    println("user and user2 are equals: ${user == user2}")
}


