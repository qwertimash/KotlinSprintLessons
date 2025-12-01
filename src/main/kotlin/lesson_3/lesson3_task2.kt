package lesson_3

fun main() {
    var userAge = 20
    var userSurname = "Андреева"
    val userFirstName = "Татьяна"
    val userPatronymic = "Сергеевна"
    println("$userSurname $userFirstName $userPatronymic, $userAge")

    userAge = 22
    userSurname = "Сидорова"
    println("$userSurname $userFirstName $userPatronymic, $userAge")
}