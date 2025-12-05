package lesson_4

const val MAX_CREW_COUNTS = 70
const val MIN_CREW_COUNTS = 55
const val RECOMMENDED_CREW_COUNTS = 70
const val MIN_PROVISIONS_COUNTS = 50


fun main() {
    val presenceOfDamage = false
    val currentCrew = 66
    val countOfProvisions = 123
    val weatherConditions = true

    println("Корабль может приступить к долгосрочному плаванию: ${(!presenceOfDamage && (currentCrew in MIN_CREW_COUNTS..MAX_CREW_COUNTS) && (countOfProvisions > MIN_PROVISIONS_COUNTS)) || ((currentCrew == RECOMMENDED_CREW_COUNTS) && weatherConditions && (countOfProvisions >= MIN_PROVISIONS_COUNTS))}")
}