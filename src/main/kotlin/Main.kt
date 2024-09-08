package org.example

fun main() {
    val randomNumber = (0..10).random()

    while (true) {
        print("Введите число от 0 до 10: ")
        val userInput = readln().toInt()

        if (userInput > randomNumber) {
            println("Много")
        } else if (userInput < randomNumber) {
            println("Мало")
        } else {
            println("Угадал")
            break
        }
    }
}