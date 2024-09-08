package org.example

fun main() {
    val array = intArrayOf(3, 5, 2, 8, 1)
    var productFor = 1
    var minFor = array[0]
    var maxFor = array[0]

    for (i in 0 until array.size) {
        productFor *= array[i]

        if (array[i] < minFor) {
            minFor = array[i]
        }
        if (array[i] > maxFor) {
            maxFor = array[i]
        }
    }
    println("Используя цикл for: произведение: $productFor; мин: $minFor; макс: $maxFor")

    var i = 0
    var productWhile = 1
    var minWhile = array[0]
    var maxWhile = array[0]
    while (i < array.size)
    {
        productWhile *= array[i]
        if (array[i] < minWhile) {
            minWhile = array[i]
        }
        if (array[i] > maxWhile) {
            maxWhile = array[i]
        }
        ++i
    }
    println("Используя цикл while: произведение: $productWhile; мин: $minWhile; макс: $maxWhile")

    val productReduce = array.reduce{a, b -> a * b}
    val minReduce = array.minOrNull()
    val maxReduce = array.maxOrNull()
    println("Используя reduce и min, max: произведение: $productReduce; мин: $minReduce; макс: $maxReduce")

    var productForEach = 1
    var minForEach = array[0]
    var maxForEach = array[0]
    array.forEach {
        productForEach *= it
        if (it < minForEach) {
            minForEach = it
        }
        if (it > maxForEach) {
            maxForEach = it
        }
    }
    println("Используя цикл forEach: произведение: $productForEach; мин: $minForEach; макс: $maxForEach")
}