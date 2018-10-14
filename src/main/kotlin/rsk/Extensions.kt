package rsk


fun main(args: Array<String>){
    val text = "With    multiple \t whitespace"
    println(replaceWhiteSpace(text))
    println(text.replaceWhiteSpaceEx())

}

// Helper function
fun replaceWhiteSpace(value: String): String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// Extension function
fun String.replaceWhiteSpaceEx(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}