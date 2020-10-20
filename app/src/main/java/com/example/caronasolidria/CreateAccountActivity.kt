package com.example.caronasolidria

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CreateAccountActivity : AppCompatActivity() {

    private var etFirstName: EditText? = null
    private var etLastName: EditText? = null
    private var etEmail: EditText? = null
    private var etPassword: EditText? = null
    private var btnCreateAccount: Button? = null
    private var progressBar: ProgressDialog? = null

    private var databaseReference:DatabaseReference? = null
    private var database:FirebaseDatabase? = null
    private var auth:FirebaseAuth? = null

    private val TAG = "CreateAccountActivity"

    private var firstName: String? = null
    private var lastName: String? = null
    private var email: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        initialize()
    }

    private fun initialize(){
        etFirstName = findViewById(R.id.et_firstName)
        etLastName = findViewById(R.id.et_lastName)
        etEmail = findViewById(R.id.et_email)
        etPassword= findViewById(R.id.et_password)
        btnCreateAccount = findViewById(R.id.btn_register)
        progressBar = ProgressDialog(this)

        database = FirebaseDatabase.getInstance()
        databaseReference = database!!.reference!!.child("usuários")
    }
}