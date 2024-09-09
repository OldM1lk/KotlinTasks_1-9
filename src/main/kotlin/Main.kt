package org.example

fun main() {
    val numbers = (1..7).toList()

    println("${numbers.joinToString(separator = " + ", postfix = " =")}")
}