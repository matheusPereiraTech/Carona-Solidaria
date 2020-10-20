package com.example.caronasolidria.ui.registerUser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.caronasolidria.R
import kotlinx.android.synthetic.main.activity_register_client.*

class RegisterClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_client)

        btnRegister.setOnClickListener{
            var nome = editTextName
            var email = editTextEmail
            var senha = editTextSenha
        }
    }
}