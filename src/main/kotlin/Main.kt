package org.example

fun main() {
    print("Введите число: ")
    val number = readln().toInt()
    val lastDigit = number % 10
    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }
    val sum = firstDigit + lastDigit
    print("Сумма первой и последней цифры: $sum")
}