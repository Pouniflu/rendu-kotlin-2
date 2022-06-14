package com.example.calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var resultat: Int = 0

    fun add(view: View) {
        resultat = number1.editableText.toString().toInt() + number2.editableText.toString().toInt()
        result.text = resultat.toString()
    }

    fun substract(view: View) {
        resultat = number1.editableText.toString().toInt() - number2.editableText.toString().toInt()
        result.text = resultat.toString()
    }

    fun divide(view: View) {
        if(number2.toString().toInt() != 0){
            resultat = number1.editableText.toString().toInt() / number2.editableText.toString().toInt()
            result.text = resultat.toString()
        }
    }

    fun multiply(view: View) {
        resultat = number1.editableText.toString().toInt() * number2.editableText.toString().toInt()
        result.text = resultat.toString()
    }
}