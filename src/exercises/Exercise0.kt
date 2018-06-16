package exercises

import kotlin.test.assertEquals

// Create an infix extension function "power" that calculates the power of an Int
// (Without using the built-in pow function)
infix fun Int.power(a: Int): Int {
    var result = 1
    for (any in 1 .. a)
        result *= this
    return result
}
// Do not change anything from here on

fun main(args: Array<String>) {

    val power = 5 power 3
    println(power);
    assertEquals<Int>(125, power)
}
