fun Int.isPositive(): Boolean = this > 0
fun String.toLowercaseString() = this.lowercase()

fun main() {
    println(1.isPositive()) // true
    println("Hello World!".toLowercaseString())
}