//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    /** Basic types */
    val popcorn = 5 // val Read-only
    var customers = 10 // var Mutable

    customers = 8
    customers += 3
    println(customers)
    println("$customers")
    println("${customers + 1}")

    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    val readOnlyShapes = listOf("Circle", "Square", "Triangle") // Read-only list
    println(readOnlyShapes)
    println("${readOnlyShapes[0]}")
    println("first : ${readOnlyShapes.first()}")
    println("last : " + readOnlyShapes.last())
    println("Circle in : " + ("Circle" in readOnlyShapes))


    /** Collections */

    // List
    val shapes: MutableList<String> = mutableListOf("Circle", "Square", "Triangle") // Mutable list
    println("count : ${shapes.count()}")
    shapes.add("pentagon")
    shapes.remove("pentagon")


    // Set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    var fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println("readOnlyFruit : " + readOnlyFruit)
    println("readOnlyFruit count : ${readOnlyFruit.count()}")
    println("banana in : ${"banana" in readOnlyFruit}")
    fruit.add("dragonfruit")
    fruit.remove("dragonfruit")


    // Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    println(juiceMenu)
    println("apple price : ${juiceMenu["apple"]}")
    println("apple price : ${juiceMenu["test"]}") // Null safety

    juiceMenu["coconut"] = 150
    juiceMenu.remove("orange")

    println("count : " + juiceMenu.count())
    println("containsKey : ${juiceMenu.containsKey("coconut")}")
    println("keys : ${juiceMenu.keys}")
    println("values : ${juiceMenu.values}")
    println("coconut" in juiceMenu)
    println("coconut" in juiceMenu.keys)
    println(100 in juiceMenu.values)

}