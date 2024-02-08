package com.danielfuentes.clasefeb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    lateinit var  btnnext:Button
    lateinit var  btnresta:Button
    lateinit var  btnnum1:Button
    lateinit var  btnnum2:Button
    lateinit var  txtnumber:EditText
    lateinit var  tvtitulo:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initUI()
    }

    private fun initUI() {
        btnnext = findViewById(R.id.btn_next)
        btnresta = findViewById(R.id.btn_resta)
        btnnum1 = findViewById(R.id.btnNum1)
        btnnum2 = findViewById(R.id.btnNum2)
        txtnumber = findViewById(R.id.txt_number)
        tvtitulo = findViewById(R.id.tv_titulo)

        tvtitulo.text = "Hola"

        btnnext.setOnClickListener{
            var edad:Int = txtnumber.text.toString().toInt()
            tvtitulo.text = "${edad + 10}"
        }

        btnresta.setOnClickListener{
            var edad:Int = txtnumber.text.toString().toInt()
            tvtitulo.text = "${edad - 10}"
        }
    }

    fun agregar4 (v: View){
        var actual = tvtitulo.text.toString()
        if(actual == "Hola"){
            tvtitulo.text = "4"
        }else {
            tvtitulo.text = tvtitulo.text.toString()+"4"
        }

    }

    fun agregar8 (v: View){
        var actual = tvtitulo.text.toString()
        if(actual == "Hola"){
            tvtitulo.text = "8"
        }else {
            tvtitulo.text = tvtitulo.text.toString()+"8"
        }

    }
}