package org.example

fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    //конкатенация
//    println(greeting + ", " + userName + '!' + space + "What is your main question?")

    //интерполяция
//    println("$greeting, $userName! What is your main question?")
//    println("To which you can respond ${40 + 2}")

    val multiString = """
                |sasdasdasdasd
            |dlmsdlkf
                    |wekjkfo
    """.trimMargin()
//    println(multiString)
    val phrase = "And he said - \"it is magnificent\""
    println(phrase)
}