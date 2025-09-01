fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "ftp"
//    val isSupported =  requested.uppercase() in SUPPORTED
    val isSupported = SUPPORTED.contains(requested.uppercase())
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}