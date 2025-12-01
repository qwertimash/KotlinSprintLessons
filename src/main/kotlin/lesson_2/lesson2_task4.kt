package org.example.lesson_2

const val FULL_PERCENT = 100.0

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercent = 20

    val bonusCrystalOre = crystalOre * (bonusPercent / FULL_PERCENT)
    val bonusIronOre = ironOre * (bonusPercent / FULL_PERCENT)

    println("Количество бонусных материалов:")
    println("Кристаллической руды: %d".format(bonusCrystalOre.toInt()))
    println("Железной руды: %d".format(bonusIronOre.toInt()))
}