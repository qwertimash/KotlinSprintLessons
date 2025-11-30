package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercent = 20

    val bonusCrystalOre = crystalOre * (bonusPercent / 100.0)
    val bonusIronOre = ironOre * (bonusPercent / 100.0)
    println("Количество бонусных материалов:")
    println("Кристаллической руды: %d".format(bonusCrystalOre.toInt()))
    println("Железной руды: %d".format(bonusIronOre.toInt()))
}