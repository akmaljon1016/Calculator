package com.rtm.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rtm.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var working: String = ""
    var isBracketOpen=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnZero.setOnClickListener {
            setText("0")
        }
        binding.btnOne.setOnClickListener {
            setText("1")

        }
        binding.btnTwo.setOnClickListener {
            setText("2")

        }
        binding.btnThree.setOnClickListener {
            setText("3")

        }
        binding.btnFour.setOnClickListener {
            setText("4")

        }
        binding.btnFive.setOnClickListener {
            setText("5")

        }
        binding.btnSix.setOnClickListener {
            setText("6")
        }
        binding.btnSeven.setOnClickListener {
            setText("7")

        }
        binding.btnEight.setOnClickListener {
            setText("8")
        }
        binding.btnNine.setOnClickListener {
            setText("9")
        }
        binding.btnPlus.setOnClickListener {
            setText("+")
        }
        binding.btnMinus.setOnClickListener {
            setText("-")
        }
        binding.btnMultiply.setOnClickListener {
            setText("*")
        }
        binding.btnDivide.setOnClickListener {
            setText("/")
        }
        binding.btnDelete.setOnClickListener {
            working = working.substring(0, working.length - 1)
            binding.edScreen.setText(working)
        }
        binding.btnBracket.setOnClickListener {
            if (isBracketOpen==true){
                setText(")")
                isBracketOpen=false
            }
            else{
                setText("(")
                isBracketOpen=true
            }
        }
        binding.btnClear.setOnClickListener {
            working=""
            binding.edScreen.setText(working)
        }
    }

    fun setText(text: String) {
        working = working + text
        binding.edScreen.setText(working)
    }
}