package org.example

fun foundPrimes(n: Int): ArrayList<Int> {
    val primeNumbers = arrayListOf(0)
    val primes = BooleanArray(n) { true }
    primes[0] = false
    primes[1] = false

    for (i in 2 until n) {
        if (primes[i]) {
            var j = i * i

            if (j < n) {
                while (j < n) {
                    primes[j] = false
                    j += i
                }
            }
        }
    }
    primeNumbers.clear()

    for (i in 2 until n) {
        if (primes[i]) {
            primeNumbers.add(i)
        }
    }
    return primeNumbers
}

fun main() {
    print("Введите количество простых чисел: ")
    val numbersCount = readln().toInt()
    val result = foundPrimes(numbersCount)

    for (i in 0 until result.size) {
        println("${i+1} - ое число: ${result[i]}")
    }
}