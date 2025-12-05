package lesson_3

fun main() {
    val moveInfo = "D2-D4;0"
    val partsOfInfo = moveInfo.split('-',';')

    val cellFrom = partsOfInfo[0]
    val cellTo = partsOfInfo[1]
    val moveNumber = partsOfInfo[2]


    println(cellFrom)
    println(cellTo)
    println(moveNumber)
}