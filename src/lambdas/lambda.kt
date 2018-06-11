package lambdas

fun main(args: Array<String>) {
lambda()

    val list = mapIntList(listOf(3,4,5,6), {index -> index + 5})
    println(list)

    applyMapFilterReduce(listOf(2, 68, 32, 3, 15, 4, 43))

}

fun lambda(){
    var sum: (Int, Int) -> Int

    sum = {v1, v2 -> v1 + v2}

    println(sum(3, 4))
}


fun mapIntList(intList: List<Int>, transform: (Int) -> Int): List<Int>{
    val mutableList = mutableListOf<Int>()

    for (i in intList)
        mutableList.add(transform(i))

    return mutableList.toList()
}

fun applyMapFilterReduce(intList: List<Int>){
    val sumOfIncrementedEvenValues =
            intList
            .map { it + 1 }                       //increment all values of the array
            .filter {it.rem(2) == 0 }        //get only even values
            .reduce { acc, i -> acc + i }  // sum all values

    println(sumOfIncrementedEvenValues)
}