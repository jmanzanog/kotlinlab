package basic

fun main() {

	val string = "String"
	val result = if (string != "") {
		println("is  Not empty")
		5
	} else {
		println("is empty")
		6
	}
	println(result)

	val result2 = when (string) {
		"string" -> "string"
		is String -> "is string"
		else -> ""
	}
	println(result2)


}