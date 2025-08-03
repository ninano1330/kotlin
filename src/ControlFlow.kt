fun main() {
    /** Conditional expressions */
    // if
    var d: Int
    val check: Boolean = true

    if(check) {
        d = 1
    } else {
        d = 2
    }

    println(d);

    // when
    val obj = "Hello"

    when(obj) {
        "1" -> println("1")
        "Hello" -> println("Hello")
        else -> println("else")
    }

    val result = when(obj) {
        "1" -> "1"
        "Hello" -> "Hello"
        else -> "else"
    }

    println(result)

    val trafficLight = "red"

    val trafficAction = when(trafficLight) {
        "red" -> "stop"
        "yellow" -> "slow down"
        "green" -> "go"
        else -> "malfunction"
    }

    println(trafficAction)

    /** Ranges & Loop */
    // For
    for(number in 1..5) {
        println(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println(cake)
    }

    // While
    var cakeEaten = 0
    while  (cakeEaten < 3) {
        println("eat a cake")
        cakeEaten++
    }
}