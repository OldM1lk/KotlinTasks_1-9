package org.example

fun main() {
    val phoneBook = mapOf(
        "Alice" to "+1-234-567-8901",
        "Bob" to "+44-123-456-7890",
        "Charlie" to "+1-987-654-3210",
        "David" to "+33-123-456-7890"
    )

    val countryCode = "+1"

    println(phoneBook.filterValues { it.startsWith(countryCode) })
}
