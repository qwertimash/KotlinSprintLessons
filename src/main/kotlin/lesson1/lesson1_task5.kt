package org.example.lesson1

fun main() {

    val seconds = 6480
    val minutes = seconds / 60
    val remainderOfSeconds = seconds % 60
    val hours = minutes / 60
    val remainderOfMinutes = minutes % 60

    print(String.format("%02d",hours))
    print(':')
    print(String.format("%02d",remainderOfMinutes))
    print(':')
    print(String.format("%02d",remainderOfSeconds))
}