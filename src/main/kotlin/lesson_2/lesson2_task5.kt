package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startValue = 70_000.0
    val annualRate = 0.167
    val years = 20.0

    val totalSum = startValue * (1 + annualRate).pow(years)

    print(String.format("%.3f", totalSum))
}