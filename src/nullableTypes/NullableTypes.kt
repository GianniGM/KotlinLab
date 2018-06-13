package nullableTypes

import classes.GDGUser

fun main(args: Array<String>) {
//todo: aggiungere lateinit

    val intero: Int? = null
    if (intero != null) {
        //intero: Int
        println(intero)
    }

    // in Kotlin you CAN'T define a null variable without "?" operator that means
    // type can be null
    val gdgUser: GDGUser? = null

    //classic null checking or...
    if (gdgUser != null)
        println(gdgUser.toString())
    else
        println(gdgUser) /*prints null*/

    //... ? checking
    println(gdgUser?.toString())


    //classic null checking or ...
    if (gdgUser != null)
        println(gdgUser.toString())
    else
        println("no user")

    // ...using elvis operator ?:
    println(gdgUser?.toString() ?: "no user")

    // you can throw an exception if you want
    println(gdgUser?.toString() ?: throw UnsupportedOperationException("no user"))

    //[DO NOT USE]!! will raise a NullPointerException at runtime
    println(gdgUser!!.toString())
}