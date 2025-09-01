data class Employee2 (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee2("Mary", 20)
    2 -> null
    3 -> Employee2("John", 21)
    4 -> Employee2("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}