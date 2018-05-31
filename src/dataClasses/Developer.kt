package dataClasses

/*  NOTE:
 *  data class provides a class with built-in method
 *  setters and getters
 *
 *  toString() => convert in a string
 *  equals() => used directly by == operator
 *  hashCode() => provides an hashCode()
 *  copy() => method to copy an object
 *  componentN() functions used for destructuring operator
 *
 *  further information: https://bit.ly/2L7yxs6 */
data class Developer( //constructor
        //fields with getters
        val userName: String,
        val age: Int,
        val gender: String,

        //fields with getters and setters
        var isOnline: Boolean = false
)