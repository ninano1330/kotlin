fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep a null here" // String? is a nullable type
    nullable = null

    var inferredNonNull = "The compiler assumes non-nullable"
//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
//    println(strLength(nullable))

    val nullString: String? = null
    println(describeString(nullString))
    println(lengthString(nullString))
    println(nullString?.uppercase())
    println(nullString?.length ?: 0)
}