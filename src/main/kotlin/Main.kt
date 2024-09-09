package org.example

fun numberToWords(number: Int): String {
    val ones = arrayOf(
        "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
    )
    val teens = arrayOf(
        "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    )
    val tens = arrayOf(
        "", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
        "семьдесят", "восемьдесят", "девяносто"
    )

    return when {
        number == 100 -> "сто"
        number < 10 -> ones[number]
        number in 10..19 -> teens[number - 10]
        else -> {
            val tenPart = number / 10
            val onePart = number % 10
            val tenText = tens[tenPart]
            val oneText = ones[onePart]
            if (onePart == 0) {
                tenText
            } else {
                "$tenText $oneText"
            }
        }
    }
}

fun main() {
    print("Введите число в диапазоне от 0 до 100: ")
    val input = readln().toInt()

    println(numberToWords(input))
}