package org.example.lesson_2

fun main() {

    val hourOfStart = 9
    val minutesOfStart = 39
    val travelTime = 457

    val totalStartMinutes = hourOfStart * 60 + minutesOfStart
    val totalArrivalMinutes = totalStartMinutes + travelTime

    val hourOfArrival = totalArrivalMinutes / 60
    val minutesOfArrival = totalArrivalMinutes % 60
    print(String.format("%02d",hourOfArrival))
    print(':')
    print(String.format("%02d",minutesOfArrival))

}