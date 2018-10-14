@file:JvmName("DisplayFunctions")
package rsk

fun main(args: Array<String>) {
    display("Hello, World")
    log("Hello, World") // Using default
    log("Hello, World", 2) // Overriding the default
    log(logLevel = 2, message = "Order doesn't matter with named parameters")
}

fun display(message: String) {
    println(message)
}

// Using default parameters and `@JvmOverloads` annotation:
@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}