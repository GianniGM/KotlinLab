package basics

fun main(args: Array<String>) {
    variables()
    ifThenElse()
    strings()
    ranges()
}

private fun variables() {

    // read only variables you can't change a val, just a var
    val age: Int = 28
    val longType: Long = 23
    val floatType: Float = 3F

    // writable variable you can change it
    var userName: String = "KotlinUser"
    userName = "GDG Pisa User"

    println("My name is $userName and i have $age years old long is $longType and float is $floatType")

}

private fun ifThenElse() {
    val a = 5
    val b = 90

    // If you want to inizialize a variable to null you must declare it as String?
    // with question mark
    var string1:String? = null
    if (a < b) {
        string1 = "a is minor than b"
    } else {
        string1 = "b is minor than b"
    }
    println(string1.toString())

    //Kotlin style
    val string = if (a < b)
        "a is minor than b"
    else
        "b is minor than b"

    println(string)
}

private fun variablesSemplified() {

    // read only variables you can't change a val, just a var
    val age = 28
    val longType = 23L
    val floatType = 3F

    // writable variable you can change it
    lateinit var userName: String

    userName = "GDG Pisa User"

    println("My name is $userName and i have $age years old: $longType and $floatType")
}

private fun strings() {
    val a = 5
    val b = 10

    // you can print variables like this WRONG way...
    println("The sum of" + a + " " + b + "is " + (a + b))

    // ...or in this, absolutely better, way
    println("The better way to sum $a + $b is ${a + b}")

    val banana = "banana"
    val strawberry = "strawberry"
    val bananaTwo = "banana"

    //you can compare strings just using ==
    println("banana and bananaTwo ${banana == bananaTwo}")
    println("banana and stawberry ${banana == strawberry}")
}

private fun ranges() {
    val fruits = 50

    //range used in if-then-else
    if (fruits in 1..100)
        println("enough fruits :)")
    else
        println("not enough :(")

    //you can use !in operator to check if a value is outside of a range
    if (fruits !in 60..80)
        println("fruits number are outside the range")

    when (fruits) {
        0 -> println("no fruit")
        in 10..49 -> println("ok :)")
        50 -> println("fifty fruits are enough")
        else -> println("PLZ STOP!")
    }
}
