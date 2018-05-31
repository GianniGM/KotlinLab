package nullableTypes

import classes.GDGUser

fun main(args: Array<String>) {

    // in Kotlin you CAN'T define a null variable without "?" operator that means
    // type can be null
    val gdgUser: GDGUser? = null

    //classic null checking
    if(gdgUser != null)
        println(gdgUser.toString())

    // is equivalento to ? checking
    println(gdgUser?.toString())


    //classic null checking
    if(gdgUser != null)
        println(gdgUser.toString())
    else
        println("no user")

    // equivalent to checking with elvis operator ?:
    println(gdgUser?.toString() ?: "no user")

    // !! will raise a NullPointerException [DO NOT USE]
    println(gdgUser!!.toString())
}