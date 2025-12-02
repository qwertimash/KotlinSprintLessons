package lesson_3

fun main() {
    var cellFrom = "E2"
    var cellTo = "E4"
    var moveNumber = 1
    println("$cellFrom, $cellTo, ${moveNumber++}")

    cellFrom = "B7"
    cellTo = "B6"
    println("$cellFrom, $cellTo, ${moveNumber++}")

    println("D2, D${2+1}, $moveNumber")
}