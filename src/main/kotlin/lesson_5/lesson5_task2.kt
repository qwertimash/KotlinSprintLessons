package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введи свой год рождения: ")
    val userBirth = readln().toInt()
    val currentYear = 2025

    val userAge = currentYear - userBirth
    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}