package com.example.dicerollerapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { RollDice() }
    }

    private fun RollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        textView.text = diceRoll.toString()
    }

    private class Dice(val numSide: Int){
        fun roll(): Int{
            return (1..numSide).random()
        }
    }

}