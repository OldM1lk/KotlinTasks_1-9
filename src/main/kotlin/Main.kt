package org.example

fun main() {
    val numbers = listOf(10, -5, 3, -2, 0, -8, 7)
    println("Исходный список: ${numbers}")

    println("Элементы списка в квадрате: ${numbers.map { it * it }}")
}