package org.example

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val D = discriminant(a, b, c)

    when {
        D > 0 -> return 2
        D == 0.0 -> return 1
        else -> return 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    val rootsCount = rootsNumber(a, b, c)

    when (rootsCount) {
        2 -> {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("У уравнения $a*x^2 + $b*x + $c = 0; $rootsCount корня: $x1; $x2")
        }
        1 -> {
            val x = (b * -1) / (2 * a)
            println("У уравнения $a*x^2 + $b*x + $c = 0; $rootsCount корень: $x")
        }
        0 -> {
            println("У уравнения $a*x^2 + $b*x + $c = 0; нет корней")
        }
    }
}

fun main() {
    val a = -1.0
    val b = -2.0
    val c = 15.0
    quadraticRoot(a, b, c)
}