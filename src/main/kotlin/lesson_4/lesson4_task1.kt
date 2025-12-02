package lesson_4

const val PLACES_NUMBER = 13

fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedToday < PLACES_NUMBER}")
    println("Доступность столиков на завтра: ${reservedTomorrow < PLACES_NUMBER}")
}