package basics

fun main(args: Array<String>) {
    variables()
    ifThenElse(5, 9)
    sum(5,78)
    strings()
    ranges()
}

private fun variables() {

    // read only variables you can't change a val, just a var
    val age: Int = 28
    val longType: Long = 23_0000_000 //23_000_000L
    val floatType: Float = 3F

    // writable variable you can change it
    var userName: String = "KotlinUser"
    userName = "GDG Pisa User"

    println("My name is $userName and i have $age years old long is $longType and float is $floatType")

}

private fun variablesSemplified() {

    // read only variables you can't change a val, just a var
    val age = 28
    val longType = 23L
    val floatType = 3F

    // writable variable you can change it
    var userName: String = "KotlinUser"
    userName = "GDG Pisa User"

    println("My name is $userName and i am $age years old: $longType and $floatType")
}

private fun ifThenElse(a: Int, b: Int) {

    lateinit var str: String
    if (a < b)
        str = "a less than b"
    else
        str = "b less than a"

    // val str = if(a < b) "a less than b" else "b less than 2

    println(str)
}

private fun sum(a: Int, b: Int){
    // you can print variables like this WRONG way...
    println("The sum of" + a + " " + b + "is " + (a + b))

    // ...or in this, absolutely better, way
    println("The better way to sum $a and $b is ${a + b}")
}

private fun strings() {
    val banana = "banana"
    val strawberry = "strawberry"
    val bananaTwo = "banana"

    //you can compare strings just using ==
    println("banana and bananaTwo ${banana == bananaTwo}")
    println("banana and strawberry ${banana == strawberry}")
}

private fun ranges() {
    val fruitsNumber = 50

    //range used in if-then-else
    if (fruitsNumber in 1..100)
        println("enough fruits :)")
    else
        println("not enough :(")

    //you can use !in operator to check if a value is outside of a range
    if (fruitsNumber !in 60..80)
        println("fruits number are outside the range")

    when (fruitsNumber) {
        0 -> println("no fruits")
        in 1..50 -> println("ok :)")
        50 -> println("fifty fruits are enough")
        else -> println("PLZ STOP!")
    }
}
