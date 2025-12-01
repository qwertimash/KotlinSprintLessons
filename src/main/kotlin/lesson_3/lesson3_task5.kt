package lesson_3

fun main() {
    val moveInfo = "D2-D4;0"
    val partsOfInfo = moveInfo.split(';')

    val moveNumber = partsOfInfo[1]
    val cells = partsOfInfo[0].split('-')
    val cellFrom = cells[0]
    val cellTo = cells[1]

    println(cellFrom)
    println(cellTo)
    println(moveNumber)
}