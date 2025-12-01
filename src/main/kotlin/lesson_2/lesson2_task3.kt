package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfStart = 9
    val minutesOfStart = 39
    val travelTime = 457

    val totalStartMinutes = hourOfStart * MINUTES_IN_HOUR + minutesOfStart
    val totalArrivalMinutes = totalStartMinutes + travelTime

    val hourOfArrival = totalArrivalMinutes / MINUTES_IN_HOUR
    val minutesOfArrival = totalArrivalMinutes % MINUTES_IN_HOUR
    println("%02d:%02d".format(hourOfArrival, minutesOfArrival))
}