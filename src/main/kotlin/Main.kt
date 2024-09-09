package org.example

fun main() {
    val numbers = listOf(10, -5, 3, -2, 0, -8, 7)
    println("Исходный список: ${numbers}")

    val negativeNumbers = numbers.filter { it < 0 }
    println("Отрицательные элементы списка: ${negativeNumbers}")
}