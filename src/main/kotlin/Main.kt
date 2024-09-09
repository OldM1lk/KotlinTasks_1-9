package org.example

open class Vehicle {

    open val speed: Int = 0
    open val name: String = "Транспортное средство"

    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановилось")
    }
}

class Boat : Vehicle() {
    override val speed: Int = 20
    override val name: String = "Лодка"

    override fun start() {
        println("$name начала плыть со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановилась")
    }
}

class Airplane : Vehicle() {
    override val speed: Int = 800
    override val name: String = "Самолет"

    override fun start() {
        println("$name взлетел со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name приземлился")
    }
}

class Tank : Vehicle() {
    override val speed: Int = 30
    override val name: String = "Танк"

    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

fun main() {
    val boat = Boat()
    val airplane = Airplane()
    val tank = Tank()

    boat.start()
    boat.stop()
    println()

    airplane.start()
    airplane.stop()
    println()

    tank.start()
    tank.stop()
}