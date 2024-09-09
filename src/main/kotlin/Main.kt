package org.example

class Point(var x: Int, var y: Int) {

    override fun toString(): String {
        return "Текущие координаты x: $x, y: $y"
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle {

    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                ++point.y
                println()
                println("Произведено перемещение по оси X на 0, по оси Y на +1")
            }
            Command.DOWN -> {
                --point.y
                println()
                println("Произведено перемещение по оси X на 0, по оси Y на -1")
            }
            Command.LEFT -> {
                --point.x
                println()
                println("Произведено перемещение по оси X на -1, по оси Y на 0")
            }
            Command.RIGHT -> {
                ++point.x
                println()
                println("Произведено перемещение по оси X на +1, по оси Y на 0")
            }
        }
        println(point)
    }
}

fun main() {

    val point = Point(0, 0)
    val turtle = Turtle()

    println(point)

    turtle.move(point, Command.UP)
    turtle.move(point, Command.RIGHT)
    turtle.move(point, Command.DOWN)
    turtle.move(point, Command.LEFT)
}