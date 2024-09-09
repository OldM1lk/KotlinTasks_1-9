package org.example

interface Figure {

    fun area(): Double
    fun perimeter(): Double
}

class Square(private val side: Double) : Figure {

    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

class Circle(private val radius: Double) : Figure {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Figure {

    override fun area(): Double {
        val s = perimeter() / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

fun main() {
    val square = Square(5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    println("Площадь квадрата: ${square.area()}; его периметр: ${square.perimeter()}")
    println("Площадь круга: ${circle.area()}; его периметр: ${circle.perimeter()}")
    println("Площадь треугольника: ${triangle.area()}; его периметр: ${triangle.perimeter()}")
}