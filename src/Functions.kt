fun hello() {
    return println("Hello, World!")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
//    println("[${prefix}] ${message}")
}

fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

val registeredUsernames = mutableListOf("john_doe", "jane_smith")
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    if(username in registeredUsernames)  {
        return "Username already taken. Please choose a different username."
    }

    if(email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}


fun main() {
//    hello()
    println(sum(1,2))
    printMessageWithPrefix("Hello");
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix(message = "Hello")
    printMessage("Hello")
    println(registerUser("john_doe", "newjohn@example.com"))
    println(registerUser("new_user", "newuser@example.com"))

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter({ x -> x > 0})
    println(positives)

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    println(negatives)

    val doubled = numbers.map{ x -> x * 2}
    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)
    println(doubled)
    println(tripled)

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}
