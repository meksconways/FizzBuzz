package com.androidkurs.fizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var sayi = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_Text.text = sayi.toString()

        //hiçbiri
        btn_change.setOnClickListener {

            if (numberControl() == 0) {
                sayi += 1
                txt_Text.text = sayi.toString()
            } else {
                showErrorAlert()
            }

        }
        btn_fizz.setOnClickListener {
            if (numberControl() == 1) {
                sayi += 1
                txt_Text.text = sayi.toString()
            } else {
                showErrorAlert()
            }

        }

        btn_buzz.setOnClickListener {
            if (numberControl() == 2) {
                sayi += 1
                txt_Text.text = sayi.toString()
            } else {
                showErrorAlert()
            }

        }

        btn_fizzBuzz.setOnClickListener {
            if (numberControl() == 3) {
                sayi += 1
                txt_Text.text = sayi.toString()
            } else {
                showErrorAlert()
            }
        }
    }

    private fun showErrorAlert() {

        Toast.makeText(applicationContext, "Yanlış Cevap!", Toast.LENGTH_SHORT).show()
        sayi = 1
        txt_Text.text = sayi.toString()
    }


    private fun numberControl(): Int {


        return when {
            sayi % 15 == 0 -> {
                3
            } //fizzbuzz


            sayi % 5 == 0 -> {
                2
            } //buzz


            sayi % 3 == 0 -> {
                1
            }//fizz

            else -> {
                0
            }//hiçbiri

        }


    }
}
