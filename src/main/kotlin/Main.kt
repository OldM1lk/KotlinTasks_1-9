package org.example

fun main() {

    print("Введите первое число: ")
    val n1 = readln().toDouble()

    print("Введите второе число: ")
    val n2 = readln().toDouble()

    print("Введите знак операции (+, -, *, /): ")
    val operation = readln()

    val result = when (operation) {
        "+" -> n1 + n2
        "-" -> n1 - n2
        "*" -> n1 * n2
        "/" -> n1 / n2
        else -> {
             return
        }
    }

    println("Результат: $result")
}