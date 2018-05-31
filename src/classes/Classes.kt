package classes

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
    val user2 = GDGUser("Domenico", "Blanco", gdg = "Pisa", nickname = "Link")

    //Kotlin
    println("${user.userId} ${user.nickname}: $user")
    println("${user2.userId} ${user2.nickname}: $user2")

    //Java
    val userJava = UserJava("Giovanni", "B", "gBart", false)
    println("${userJava.userId} ${userJava.nickName}: $userJava")
}