package lesson_4

const val NAME_DAY_OF_ABS_AND_HANDS = "a&h"
const val NAME_DAY_OF_BACK_AND_LEGS = "b&l"

fun main() {
    val currentDay = 3
    val firstDayExercises = NAME_DAY_OF_ABS_AND_HANDS

    println(
        """
        Упражнения для рук:    ${((currentDay % 2 == 1) && (firstDayExercises == NAME_DAY_OF_ABS_AND_HANDS)) || ((currentDay % 2 == 0) && (firstDayExercises == NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для ног:    ${((currentDay % 2 == 1) && (firstDayExercises != NAME_DAY_OF_ABS_AND_HANDS)) || ((currentDay % 2 == 0) && (firstDayExercises != NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для спины:  ${((currentDay % 2 == 1) && (firstDayExercises != NAME_DAY_OF_ABS_AND_HANDS)) || ((currentDay % 2 == 0) && (firstDayExercises != NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для пресса: ${((currentDay % 2 == 1) && (firstDayExercises == NAME_DAY_OF_ABS_AND_HANDS)) || ((currentDay % 2 == 0) && (firstDayExercises == NAME_DAY_OF_BACK_AND_LEGS))}
    """.trimIndent()
    )
}