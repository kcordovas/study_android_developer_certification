package com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.addabutton.interactivedicerollapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kevcordovas.studycertificationandroiddeveloperapp.R
import com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.addabutton.Dice

/**
 * Copyright 2021, kevcordova
 *
 * This Activity allows the user to roll a dice and view the result
 * on the screen
 *
 * @author kevcordova
 */
class DiceRollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        // Create new Dice instance with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView3)
        resultTextView.text = diceRoll.toString()
    }
}