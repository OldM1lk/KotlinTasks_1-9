package org.example

fun main() {
    val words: List<String?> = listOf("когда", null, "эти", "задания", null, "уже", "закончатся")

    println("Используя оператор if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        }
    }

    println()
    println("Используя оператор безопасного вызова ?:")
    for (word in words) {
        println(word?.uppercase())
    }

    println()
    println("Используя функцию let:")
    for (word in words) {
        word?.let {
            println(it.uppercase())
        }
    }

    println()
    println("Используя Элвис-оператор ?:")
    for (word in words) {
        val result = word?.uppercase() ?: "EMPTY"
        println(result)
    }
}