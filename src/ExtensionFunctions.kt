fun String.bold() : String = "<b>$this</b>"

fun main() {
//    println("hello".bold())

    val client = HttpClient()
    val getResponseWithMember = client.request("GET", "https://example.com", emptyMap())
    val getResponseWithExtension = client.get("https://example.com")
}

fun HttpClient.get(url: String): HttpResponse = request("GET", url, emptyMap())

class HttpClient {
    fun request(method: String, url: String, headers: Map<String, String>): HttpResponse {
        println("Requesting $method to $url with headers: $headers")
        return HttpResponse("Response from $url")
    }
}

class HttpResponse(url: String) {
    val url: String = url;
}