package org.example

fun main() {
    print("Введите время в формате ЧАСЫ:МИНУТЫ:СЕКУНДЫ: ")
    val timeString = readln()

    val (hours, minutes, seconds) = timeString.split(":").map { it.toInt() }

    println("Количество секунд, прошедших с начала дня: ${hours * 3600 + minutes * 60 + seconds}")
}
