fun main() {
    val user = setUser("Liza","Reading", 16)
    println(user)
}
fun setUser(name: String,hobby: String, age: Int) = "My name is $name, i like $hobby, and i'm $age years old"