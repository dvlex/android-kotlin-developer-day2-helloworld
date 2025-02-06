package com.example.android_kotlin_developer_day2_hello_world

fun main() {
    var botChoice: Int
    var userChoice = 1

    while (userChoice in 1..3) {
        botChoice = (1..3).random()
        println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors")
        userChoice = readLine()!!.toInt()

        if (userChoice == botChoice) {
            println("It's a draw!")
        } else if (userChoice == 1 && botChoice == 3 || userChoice == 2 && botChoice == 1 || userChoice == 3 && botChoice == 2) {
            println("You win!")
        } else {
            println("You lose!")
        }
    }
}