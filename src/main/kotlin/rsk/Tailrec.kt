package rsk

import java.math.BigInteger

fun main(args: Array<String>){
    println(fib(10, BigInteger("1"), BigInteger("0"))) // 55
}

// Recursive function
fun fib(n: Int, a: BigInteger, b: BigInteger) :BigInteger {
    return if (n == 0) b else fib (n -1, a + b, a)
}

// 1, 1, 2, 3, 5, 8, 13, ...