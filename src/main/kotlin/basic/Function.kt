package basic

fun sayHelloException(): Nothing {
	println("Hello Exception")
	throw NullPointerException()
}

fun sayHello(): Unit {
	println("Hello")
}

fun sayHello2(): Any {
	return println("Hello2")
}

fun sum(x: Int = 0, y: Int = 0) = x.plus(y)

fun printString(vararg strings: Any) {
	for (s in strings) {
		println(s)
	}
}

fun main() {
	sayHello()
	sayHello2()

	println(sum())
	println(sum(3, 5))
	printString()
	printString()
	printString(1)
	printString("2")
	printString("2", 3, 1.9902)

	sayHelloException()
}