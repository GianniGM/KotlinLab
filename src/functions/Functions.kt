package functions

//TODO: every function returns something,
// if have side effects then returns Unit (omitted by default)
fun main(args: Array<String>): Unit {
    val sumC = sumClassic(5, 2)
    val sumS = sumSmart(3, 4)
    val awesomeSum = 10.somma(2)

    val awesomeIncrementer = 5 incrementIfMaxThan 2
    println("incrementer: $awesomeIncrementer")
}

// takes two ints and returns an Int
fun sumClassic(a: Int, b: Int): Int {
    return a + b
}

// takes two ints and returns an Int
fun sumSmart(a: Int, b: Int) = a + b

// EXTENSION FUNCTION,
// extending Int class, get first Int from "this" and second one from parameter,
// returns an Int
infix fun Int.somma(a: Int) = this + a

// same but we use infix to use as infix operator
infix fun Int.incrementIfMaxThan(a: Int) = if (this > a)
    this + 1
else
    this

infix fun Int.incOfOneIfEvenElseTwo(a: Int) = if (this.rem(2) == 0)
    this + 1
else
    this + 2
