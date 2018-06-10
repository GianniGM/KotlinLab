package classes

//Kotlin classes are final by default use open operator
open class User(
        private var name: String ,       //private field: no getter if outside the class
        private val surName: String,    //private field: no getter if outside the class
        val nickname: String,           //public field: have just getter
        var isOffline: Boolean = true   //public field: have each getter and setter and default
) {
    companion object {
        private var currentId = 0
    }

    val userId = ++currentId

    override fun toString(): String {
        return "Ciao $name $surName sei ${if (isOffline) "off" else "on"}line"
    }
}
