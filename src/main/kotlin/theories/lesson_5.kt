package theories

fun main() {
    val userAge = readln().toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать скрытый контент"
    } else if (userAge == 16 || userAge == 17) {
        "Показать экран с ограниченным контентом"
    } else {
        "Назад на главную"
    }

//    println(resultText)

    val age = when (userAge) {
        10 -> {
            println("Тебе чо делать")
            "10 лет"
        }
        20 -> "20 лет"
        42-> "42 года"
        else -> "ты красава"
    }
    println(age)
}

//const val AGE_OF_MAJORITY = 18