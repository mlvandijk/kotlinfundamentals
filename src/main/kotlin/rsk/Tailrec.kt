package rsk

import java.math.BigInteger

fun main(args: Array<String>){
    println(fib(100000, BigInteger("1"), BigInteger("0"))) // 55
}

// tailrec function; Kotlin will replace with a loop in the bytecode to prevent stack overflow
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger) :BigInteger {
    return if (n == 0) b else fib (n -1, a + b, a)
}

// 1, 1, 2, 3, 5, 8, 13, ...