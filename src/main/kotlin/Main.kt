package org.example

class Vector(private val x: Double, private val y: Double, private val z: Double) {

    fun length(): Double {
        return Math.sqrt(x * x + y * y + z * z)
    }

    infix fun product(other: Vector): Double {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }

    operator fun times(other: Vector): Double {
        return this.product(other)
    }
}

fun timesProduct(v1: Vector, v2: Vector): Double {
    return v1 * v2
}

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора vector1: ${vector1.length()}")
    println("Скалярное произведение (внутри класса): ${vector1.product(vector2)}")
    println("Скалярное произведение (*): ${vector1 * vector2}")
    println("Скалярное произведение (вне класса): ${timesProduct(vector1, vector2)}")
}