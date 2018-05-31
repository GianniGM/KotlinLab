package classes

import classes.UserJava.UserJava
import classes.UserKotlin.GDGUser

/*
class GDGUser(...) : SuperClass(...)
 */

fun main(args: Array<String>) {
    val user = GDGUser("Diana", "Bernabei", "dBerna", gdg = "Pisa")
    val user2 = GDGUser("Domenico", "Blanco", gdg = "Pisa", nickname = "Link")

    //Kotlin
    println("${user.userId} ${user.nickname}: $user")
    println("${user2.userId} ${user2.nickname}: $user2")

    //Java
    val userJava = UserJava("Giovanni", "B", "gBart", false)
    println("${userJava.userId} ${userJava.nickName}: $userJava")
}