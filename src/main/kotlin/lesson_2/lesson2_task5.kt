package org.example.lesson_2

import kotlin.math.pow

const val FULL_PERCENT = 100

fun main() {
    val startValue = 70_000.0
    val annualRate = 16.7
    val years = 20.0

    val totalSum = startValue * (1 + annualRate / FULL_PERCENT).pow(years)

    print("%.3f".format(totalSum))
}