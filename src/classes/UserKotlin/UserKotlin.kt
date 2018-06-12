package classes.UserKotlin

// Kotlin interfaces are open by default
interface UserInterfaceKotlin {
    fun greetings(): String
}


// Kotlin classes are final by default, use open operator if you want extend User
open class User(
        private var name: String,       //private field: no getter if outside the class
        private val surName: String,    //private field: no getter if outside the class
        val nickname: String,           //public field: have just getter
        var isOffline: Boolean = true   //public field: have each getter and setter and default
) : UserInterfaceKotlin {

    companion object {
        private var currentId = 0
    }

    val userId = ++currentId

    override fun greetings() = "Hello $nickname !"

    override fun toString() = "Ciao $name $surName sei ${if (isOffline) "off" else "on"}line"
}

//User extension GDGUser
class GDGUser(
        name: String,
        surName: String,
        nickname: String,
        isOffline: Boolean = true,
        var gdg: String
) : User(name, surName, nickname, isOffline){
    override fun toString() = "${super.toString()} from GDG$gdg"
}