package org.example

fun main() {
    val array = arrayOf(1, 3, 2, 4, 1, 5, 3)

    print("Используя цикл for: ")
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            print("${array[i]} ")
        }
    }
    println()

    print("Используя цикл while: ")
    var i = 1
    while (i < array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            print("${array[i]} ")
        }
        ++i
    }
    println()

    print("Используя цикл forEach: ")
    array.forEachIndexed { index, value ->
        if (index > 0 && index < array.size - 1) {
            if (value > array[index - 1] && value > array[index + 1]) {
                print("$value ")
            }
        }
    }
}