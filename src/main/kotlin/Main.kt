package org.example

fun main() {
    var count = 0
    var sum = 0

    while (true) {
        print("Введите число: ")
        val number = readln().toInt()

        if (number == 0) {
            break
        }

        sum += number
        ++count
    }

    if (count > 0) {
        val average = sum / count

        println("Количество введенных чисел: $count")
        println("Сумма введенных чисел: $sum")
        println("Среднее арифметическое: $average")
    } else {
        println("Вы не ввели ни одного числа.")
    }
}