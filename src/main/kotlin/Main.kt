package org.example

class NumberArray(private val numbers: IntArray) {

    fun positiveSum(): Long {
        var sum: Long = 0

        numbers.forEach {
            if (it > 0) {
                sum += it
            }
        }

        return sum
    }

    fun product(): Long {
        var product: Long = 1

        numbers.forEach {
            product *= it
        }

        return product
    }

    fun average(): Double {
        return numbers.average()
    }
}

fun main() {
    val array = intArrayOf(3, -1, 4, 6, -2, 8)
    val numberArray = NumberArray(array)

    println("Сумма положительных элементов: ${numberArray.positiveSum()}")
    println("Произведение элементов: ${numberArray.product()}")
    println("Среднее арифметическое элементов: ${numberArray.average()}")
}