package org.example

class Car(var name: String, var speed: Int)

data class Vehicle(var name: String, var speed: Int)

fun main() {
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)

    println("car1 == car2: ${car1 == car2}")
    println("car1 === car2: ${car1 === car2}")

    println("car1 hashCode: ${car1.hashCode()}")
    println("car2 hashCode: ${car2.hashCode()}")

    val car3 = car1
    println("car1 == car3: ${car1 == car3}")   // true, т.к. ссылки на один и тот же объект
    println("car1 === car3: ${car1 === car3}") // true, т.к. это один и тот же объект

    println("car1 hashCode: ${car1.hashCode()}")
    println("car3 hashCode: ${car3.hashCode()}")

    car3.name = "Belaz"
    println("car1 name: ${car1.name}") // "Belaz", т.к. car1 и car3 - один и тот же объект
    println("car3 name: ${car3.name}")

    val vehicle1 = Vehicle("Ural", 100)
    val vehicle2 = Vehicle("Ural", 100)

    println("vehicle1 == vehicle2: ${vehicle1 == vehicle2}")   // true, т.к. data-класс сравнивает содержимое
    println("vehicle1 === vehicle2: ${vehicle1 === vehicle2}") // false, т.к. разные объекты

    println("vehicle1 hashCode: ${vehicle1.hashCode()}")
    println("vehicle2 hashCode: ${vehicle2.hashCode()}")

    val vehicle3 = vehicle1.copy(name = "ZIL")
    val vehicle4 = vehicle1.copy()

    println("vehicle1 == vehicle3: ${vehicle1 == vehicle3}")   // false, т.к. у них разные поля name
    println("vehicle1 === vehicle3: ${vehicle1 === vehicle3}") // false, разные объекты

    println("vehicle1 == vehicle4: ${vehicle1 == vehicle4}")   // true, т.к. у них одинаковое содержимое
    println("vehicle1 === vehicle4: ${vehicle1 === vehicle4}") // false, разные объекты

    println("vehicle1 hashCode: ${vehicle1.hashCode()}")
    println("vehicle3 hashCode: ${vehicle3.hashCode()}")
    println("vehicle4 hashCode: ${vehicle4.hashCode()}")
}