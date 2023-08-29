package com.curso.android.app.practica.proyectofinal.proyectofinal.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNumero1 : EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnSumar : Button
    lateinit var txtResultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        txtResultado = findViewById(R.id.txtResultado)


       btnSumar.setOnClickListener(View.OnClickListener {
           val num1 = Integer.parseInt(edtNumero1.text.toString())
           val num2 = Integer.parseInt(edtNumero2.text.toString())

          txtResultado.setText("Resultado es: " + sumar(num1, num2))
       })
    }

    fun sumar(numero1: Int, numero2: Int) : Int{
        return numero1 + numero2
    }
}