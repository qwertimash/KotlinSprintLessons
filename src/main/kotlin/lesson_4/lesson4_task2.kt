package lesson_4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    val firstCargoCompliance = ((AVERAGE_MIN_WEIGHT < firstCargoWeight) && (firstCargoWeight <= AVERAGE_MAX_WEIGHT))
            && (firstCargoVolume < AVERAGE_MAX_VOLUME)
    val secondCargoCompliance = ((AVERAGE_MIN_WEIGHT < secondCargoWeight) && (secondCargoWeight <= AVERAGE_MAX_WEIGHT))
            && (secondCargoVolume < AVERAGE_MAX_VOLUME)

    println(
        "Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л " +
                "соответствует категории 'Average': ${firstCargoCompliance}"
    )
    println(
        "Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л " +
                "соответствует категории 'Average': ${secondCargoCompliance}"
    )
}