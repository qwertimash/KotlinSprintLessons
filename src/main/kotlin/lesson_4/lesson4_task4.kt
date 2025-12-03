package lesson_4

const val NAME_DAY_OF_ABS_AND_HANDS = "a&h"
const val NAME_DAY_OF_BACK_AND_LEGS = "b&l"

fun main() {
    val currentDay = 5
    val firstDayExercises = NAME_DAY_OF_ABS_AND_HANDS
    val parityOfCurrentDay = currentDay % 2 == 0

    println(
        """
        Упражнения для рук:    ${(!parityOfCurrentDay && (firstDayExercises == NAME_DAY_OF_ABS_AND_HANDS)) || (parityOfCurrentDay && (firstDayExercises == NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для ног:    ${(!parityOfCurrentDay && (firstDayExercises != NAME_DAY_OF_ABS_AND_HANDS)) || (parityOfCurrentDay && (firstDayExercises != NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для спины:  ${(!parityOfCurrentDay && (firstDayExercises != NAME_DAY_OF_ABS_AND_HANDS)) || (parityOfCurrentDay && (firstDayExercises != NAME_DAY_OF_BACK_AND_LEGS))}
        Упражнения для пресса: ${(!parityOfCurrentDay && (firstDayExercises == NAME_DAY_OF_ABS_AND_HANDS)) || (parityOfCurrentDay && (firstDayExercises == NAME_DAY_OF_BACK_AND_LEGS))}
    """.trimIndent()
    )
}