package lesson_5

fun main() {
    val number1 = 5
    val number2 = 10

    print("Докажи что не бот! Реши пример: $number1 + $number2 = ")
    val answer = readln().toInt()

    if (answer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}