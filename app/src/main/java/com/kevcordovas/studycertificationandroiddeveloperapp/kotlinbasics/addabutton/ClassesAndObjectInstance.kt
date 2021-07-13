package com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.addabutton

fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.sides} side dice rolled ${myFirstDice.roll()}!")
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.sides} side dice rolled ${mySecondDice.roll()}!")

}

class Dice(var sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}

/**
 * Generate Random Number with Int Range
 */
fun generateIntRange() {
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: $randomNumber")
}