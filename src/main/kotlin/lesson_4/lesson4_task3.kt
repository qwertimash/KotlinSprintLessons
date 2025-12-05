package lesson_4

const val REQUIRED_WEATHER_IS_SUNNY = true
const val REQUIRED_TENT_IS_OPEN = true
const val REQUIRED_AIR_HUMIDITY_PERCENT = 20
const val EXCEPTIONAL_SEASON = "winter"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidityPercent = 20
    val currentSeason = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isSunny == REQUIRED_WEATHER_IS_SUNNY) &&
                    (isAwningOpen == REQUIRED_TENT_IS_OPEN) &&
                    (airHumidityPercent == REQUIRED_AIR_HUMIDITY_PERCENT) &&
                    (currentSeason != EXCEPTIONAL_SEASON)
        }"
    )
}