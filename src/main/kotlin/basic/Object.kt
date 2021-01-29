package basic
// Singleton by default
object Global {
	val PI = 3.14159
}

fun main() {
	val localObject = object {val PI = 3.14159
		 lateinit var value: String}
	localObject.value = "llll"
	println(Global.PI)
	println(localObject.PI)
	println(localObject.value)
}