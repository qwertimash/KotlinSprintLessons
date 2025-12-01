package org.example.lesson_2

fun main() {
    val countOfWorkers = 50
    val workersSalary = 30000

    val countOfTrainee = 30
    val traineeSalary = 20000

    val workersSalaryCost = countOfWorkers * workersSalary
    println(workersSalaryCost)

    val traineeSalaryCost = countOfTrainee * traineeSalary
    val allSalaryCost = workersSalaryCost + traineeSalaryCost
    println(allSalaryCost)

    val averageSalary = allSalaryCost / (countOfTrainee + countOfWorkers)
    println(averageSalary)
}