package com.example.caronasolidria.ui.registerUser

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.caronasolidria.R
import com.example.caronasolidria.util.ValidacaoFirebase.Companion.opcoesErro
import com.example.caronasolidria.util.ValidacaoFirebase.Companion.verificarInternet
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register_client.*

class RegisterClient : AppCompatActivity() {
    private var firebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_client)

        btnRegister.setOnClickListener {
            cadastrar(
                editTextEmail.text.toString().trim(),
                editTextSenha.text.toString().trim(),
                editTextName.text.toString().trim()
            )
            finish()
        }
    }

    fun cadastrar(email: String, senha: String, nome: String) {
        if (email.isEmpty() || senha.isEmpty() || nome.isEmpty()) {
            Toast.makeText(this, "Preencha os campos corretamente!!!", Toast.LENGTH_LONG).show()
        } else {
            if (verificarInternet(this)) {
                criarUsuario(email, senha)
            } else {
                Toast.makeText(this, "Verifique sua internet", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun criarUsuario(email: String, senha: String) {
        firebaseAuth.createUserWithEmailAndPassword(email, senha).addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(this, "Cadastrado com sucesso.", Toast.LENGTH_LONG).show()
                finish()
            } else {
                opcoesErro(this, it.exception.toString())
            }
        }
    }

}