package basic

fun main(args: Array<String>) {

	for (a in 1000 downTo 0 step 876) {
		println(a)
	}
	for (a in 0..1000 step 549) {
		println(a)
	}

	for (a in 'a'..'z' step 20) {
		println(a)
	}

	loop@ for (a in 1..1000) {
		for (b in 1..1000) {
			if (a % b == 11) {
				println("a:$a, b:$b")
				break@loop
			}
			println("a:$a, b:$b")

		}
	}

}