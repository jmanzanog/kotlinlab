package basic


import java.util.Calendar


open class Customer(var id: Int = 0, var name: String = "", private val yearOfBirth: Int = 0) {
	var age: Int
		get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
		set(value) {
			if (value > Calendar.getInstance().get(Calendar.YEAR)) {
				throw IllegalArgumentException("$value is a invalid Year")
			}
		}

	init {
		name = name.toUpperCase()
		if (yearOfBirth > Calendar.getInstance().get(Calendar.YEAR)) {
			throw IllegalArgumentException("$yearOfBirth is a invalid Year")
		}
	}

	override fun toString(): String {
		return "{\n  \"name\": $name,\n  \"id\": $id,\n  \"age\": $age\n}"
	}
}

data class Customer2(var id: Int = 0, var name: String = "", private val yearOfBirth: Int = 0)
data class Customer3(val value: String = "") : Customer()


fun main() {
	val c = Customer(name = "jose", yearOfBirth = 2020)
	val c2 = Customer2(name = "jose", yearOfBirth = 2020)
	val c3 = Customer3()
	c3.name = "JM"
	c.id = 1234567890
//	c.age = 2022
	println(c.toString())
	println(c2.toString())
	println(c3.toString())
}