package basic

fun main(args: Array<String>) {
	println("Hello World!")
	val a = 2
	val b: Int = 2
	val hello = "Hello"
	println(a.dec())
	println(b.dec())
	println(args.size)

	val multipleLinesString = """
		this is a line
		another line
		and another with variable interpolation $b 
		and length ${hello.length}
	""".trimIndent()
	println(multipleLinesString)

}