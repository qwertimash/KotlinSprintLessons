package org.example.lesson1

const val UNITS_OF_TIME = 60

fun main() {
    val seconds = 6480
    val minutes = seconds / UNITS_OF_TIME
    val remainderOfSeconds = seconds % UNITS_OF_TIME
    val hours = minutes / UNITS_OF_TIME
    val remainderOfMinutes = minutes % UNITS_OF_TIME

    print("%02d:%02d:%02d".format(hours,remainderOfMinutes,remainderOfSeconds))
}