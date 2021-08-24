package com.kevcordovas.studycertificationandroiddeveloperapp.kotlinbasics.layouts.userinput1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevcordovas.studycertificationandroiddeveloperapp.R
import com.kevcordovas.studycertificationandroiddeveloperapp.databinding.ActivityTipCalculatorBinding
import java.text.NumberFormat
import kotlin.math.ceil

class TipCalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTipCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener{ onTipCalculate()}
    }

    private fun onTipCalculate() {
        val stringIntTextField = binding.inputCostOfService.text.toString()
        val cost = stringIntTextField.toDoubleOrNull()
        if (cost == null) {
            displayTip(0.0)
            return
        }

        val tipPercent = when (binding.tipsOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercent * cost

        if (binding.switchRoundUp.isChecked) {
            tip = ceil(tip)
        }

        displayTip(tip)
    }

    private fun displayTip(tip: Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.textTipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}