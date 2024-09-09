package org.example

fun main() {
    val numbers = listOf(10, -5, 3, -2, 0, -8, 7)
    println("Исходный список: ${numbers}")

    println("Измененный список: ${numbers.map { if (it > 0) -it else it }}")
}