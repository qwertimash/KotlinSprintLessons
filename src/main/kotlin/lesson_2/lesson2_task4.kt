package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    println("Количество бонусных материалов:")
    print("Кристаллической руды: ")
    println(crystalOre / 5) // деление на 5 <=> умножение на 0.2, но делим целое на целое = целое
    print("Железной руды: ")
    println(ironOre / 5)
}