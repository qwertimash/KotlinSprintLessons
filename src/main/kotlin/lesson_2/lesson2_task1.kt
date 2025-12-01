package org.example.lesson_2

fun main() {
    val countOfStudents = 4
    val mark1 = 3.0
    val mark2 = 4.0
    val mark3 = 3.0
    val mark4 = 5.0

    val averageMark = (mark1 + mark2 + mark3 + mark4) / countOfStudents

    println(String.format("%.2f", averageMark))
}