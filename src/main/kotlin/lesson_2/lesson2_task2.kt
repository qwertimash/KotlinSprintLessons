package org.example.lesson_2

fun main() {

    val countOfWorkers = 50
    val workersSalary = 30000

    val countOfTrainee = 50
    val traineeSalary = 20000

    val workerksSalaryCost = countOfWorkers * workersSalary
    println(workerksSalaryCost)

    val traineeSalaryCost = countOfTrainee * traineeSalary
    val allSalaryCost = workerksSalaryCost + traineeSalaryCost
    println(allSalaryCost)

    val averageSalary = allSalaryCost / (countOfTrainee + countOfWorkers)
    println(averageSalary)

}