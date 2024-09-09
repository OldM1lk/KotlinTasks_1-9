package org.example

class NumberArray(private val numbers: IntArray) {

    fun transformArray(): IntArray {
        val transformedArray = numbers

        for (i in transformedArray.indices) {
            if (i % 2 == 0) {
                transformedArray[i] *= 2
            } else {
                transformedArray[i] *= 3
            }
        }

        return transformedArray
    }

    fun maxElement(): Int {
        return numbers.max()
    }

    fun minElement(): Int {
        return numbers.min()
    }

    val sum: Int
        get() = numbers.sum()

}

fun main() {
    val array = intArrayOf(3, 2, 4, 5, 1)
    val numberArray = NumberArray(array)

    println("Исходный массив: ${array.contentToString()}")
    println("Максимальный элемент: ${numberArray.maxElement()}")
    println("Минимальный элемент: ${numberArray.minElement()}")
    println("Сумма элементов: ${numberArray.sum}")
    println("Измененный массив: ${numberArray.transformArray().contentToString()}")
}