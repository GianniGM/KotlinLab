package exercises

data class User(var name: String, var surname: String, var age: Int)

// 1. Write a function "TNames" that takes a list of Users as input and prints
//    the names of Users whose name starts with T.


// 2. Write a function "adultNames" that takes a list of Users as input and prints
//    the names of the Users whose age is between 20 and 100 (inclusive).


// 3. Write a function "evenAgedSurnames" that takes a list of Users as input and
//    prints alphabetically sorted surnames (without repeating the same surname twice)
//    of Users whose age is an even number.


// Do not change anything from here on
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

    println("Names beginning with T:")
    TNames(usersList)    

    println("Names of users with an age between 20 and 100 (inclusive)")
    adultNames(usersList)

    println("Surnames of users with an even age")
    evenAgedSurnames(usersList)
}
