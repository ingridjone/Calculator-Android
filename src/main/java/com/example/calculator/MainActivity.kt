package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Setting up public variables
    var calculation: String = ""
    var number = ""
    var memory: CharSequence = ""

    //Setting up Double variables for math operations
    var firstNum: Double = 0.0
    var secNum: Double = 0.0
    var result = 0.0

    //Buttons 0-9 OnClick functions
    fun btn1 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn1 Pressed")
        number += 1
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        //Display number 1 in textView when clicked
        textView.text = number.toString()
    }

    fun btn2 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn2 Pressed")
        number += 2
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn3 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn3 Pressed")
        number += 3
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn4 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn4 Pressed")
        number += 4
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn5 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn5 Pressed")
        number += 5
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn6 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn6 Pressed")
        number += 6
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn7 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn7 Pressed")
        number += 7
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn8 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn8 Pressed")
        number += 8
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn9 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn9 Pressed")
        number += 9
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    fun btn0 (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btn0 Pressed")
        number += 0
        if (calculation == "") {
            firstNum = number.toDouble()
        } else {
            secNum = number.toDouble()
        }
        textView.text = number.toString()
    }

    //Operations functions
    fun btnPlus (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnPlus Pressed")
        calculation = "plus"
        number = ""
        //Display + sign when clicked
        textView.text = "+"
    }

    fun btnMinus (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnMinus Pressed")
        calculation = "minus"
        number = ""
        textView.text = "-"
    }

    fun btnMultiply (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnMultiply Pressed")
        calculation = "multiply"
        number = ""
        textView.text = "x"
    }

    fun btnDivide (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnDivide Pressed")
        calculation = "divide"
        number = ""
        textView.text = "/"
    }

    //Display result in textView
    fun btnResult (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnResult Pressed")
        //Check to see which operation has been pressed
        when (calculation) {
            "plus" -> result = firstNum + secNum
            "minus" -> result = firstNum - secNum
            "multiply" -> result = firstNum * secNum
            "divide" -> result = (firstNum / secNum)
        }
        textView.text = result.toString()
    }

    //Clear texView
    fun btnClear (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnClear Pressed")
        //Erase anything in the textView
        textView.setText("")
        //Reset variables
        number = ""
        calculation = ""
    }

    //Memory Save, Recall, and Clear functions
    fun btnMS (view: View) {
        var textView: TextView = findViewById<TextView>(R.id.textView)
        Log.i("Info", "btnMS Pressed")
        //Store anything in the textView to "memory" variable
        memory = textView.text
        textView.setText("")
        number = ""
    }

    fun btnMR (view: View) {
        Log.i("Info", "btnMR Pressed")
        var textView: TextView = findViewById<TextView>(R.id.textView)
        //Retrieve value from "memory" and display it in textView
        textView.text = memory
        number = ""
    }

    fun btnMC (view: View) {
        Log.i("Info", "btnMC Pressed")
        //Reset "memory" variable
        memory = ""
        number = ""
    }
}