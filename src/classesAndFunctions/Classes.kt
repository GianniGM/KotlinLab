package classesAndFunctions

//Kotlin classes are final by default use open operator
open class User(
        private val name: String,       //private field: no getter if outside the class
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

//User extension
class GDGUser(
        name: String,
        surName: String,
        nickname: String,
        isOffline: Boolean = true,
        var gdg: String
) : User(name, surName, nickname, isOffline){
    override fun toString(): String {
        return "${super.toString()} from GDG$gdg"
    }
}

fun main(args: Array<String>) {
    val user = GDGUser("Diana", "Bernabei", "dBerna", gdg = "Pisa")
    val user2 = GDGUser("Domenico", "Blanco",gdg = "Pisa", nickname = "Link")

    //Kotlin
    println("${user.userId} ${user.nickname}: $user")
    println("${user2.userId} ${user2.nickname}: $user2")

    //Java
    val userJava = UserJava("Giovanni", "B", "gBart", false)

    println("${userJava.userId} ${userJava.nickName}: $userJava")
}