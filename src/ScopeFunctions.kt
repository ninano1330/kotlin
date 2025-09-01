fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}

fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}

class Client() {
    var token: String? = null
    fun connect() = println("connected!")
    fun authenticate() = println("authenticated!")
    fun getData(): String = "Mock data"
}

class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int): Unit = println("$x, $y, $w, $h")
    fun circ(x: Int, y: Int, rad: Int): Unit = println("$x, $y, $rad")
    fun text(x: Int, y: Int, str: String): Unit = println("$x, $y, $str")
}

val client: Client = Client().apply {
    token = "asdf"
}

fun main() {
    val address: String? = getNextAddress()

//    val confirm = if(address != null) {
//        sendNotification(address)
//    } else { null }
    val confirm = address?.let {
        sendNotification(address)
    }

//    client.token = "asdf"
//    client.connect() // connected!
//    client.authenticate() // authenticated!

    val result: String = client.run {
        connect()
        authenticate()
        getData()
    }

    val medals: List<String> = listOf("Gold", "Silver", "Bronze")
    val reversedLongUppercaseMedals: List<String> =
        medals
            .map { it.uppercase() }
            .also { println(it) }  // [GOLD, SILVER, BRONZE]
            .filter { it.length > 4 }
            .also { println(it) }  // [SILVER, BRONZE]
            .reversed()
    println(reversedLongUppercaseMedals)  // [BRONZE, SILVER]

    val mainMonitorSecondaryBufferBackedCanvas = Canvas()

    with(mainMonitorSecondaryBufferBackedCanvas) {
        text(10, 10, "Foo")
        rect(20, 30, 100, 50)
        circ(40, 60, 25)
        text(15, 45, "Hello")
        rect(70, 80, 150, 100)
        circ(90, 110, 40)
        text(35, 55, "World")
        rect(120, 140, 200, 75)
        circ(160, 180, 55)
        text(50, 70, "Kotlin")
    }
}