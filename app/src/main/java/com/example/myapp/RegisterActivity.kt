package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

//class RegisterActivity : AppCompatActivity() {
//
//    lateinit var name: EditText
//    lateinit var Email: EditText
//    lateinit var phone: EditText
//    lateinit var address: EditText
//    lateinit var password: EditText
//    lateinit var confirm: EditText
//    lateinit var buttin: Button
//
//    var validName = "Haral"
//    var validEmail = "haral@gmail.com"
//    var validPhone = "1223"
//    var validAddress = "nager"
//    var validPassword = "123"
//    var validConfirm = "123"
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
//
//        name = findViewById(R.id.name)
//        Email = findViewById((R.id.Email))
//        phone = findViewById(R.id.phone)
//        address = findViewById(R.id.address)
//        confirm = findViewById(R.id.confirm)
//        buttin = findViewById(R.id.buttin)
//        password = findViewById(R.id.password)
//
//
//        buttin.setOnClickListener {
//
//            var name = name.text.toString()
//            var Email = Email.text.toString()
//            var phone = phone.text.toString()
//            var address = address.text.toString()
//            var password = password.text.toString()
//            var confirm = confirm.text.toString()
//
//           if (validName == name && validEmail == Email && validPhone == phone && validAddress == address && validPassword == password && validConfirm == confirm) {
//               var intent = Intent(this@RegisterActivity, ForgotPasswordActivity::class.java)
//               startActivity(intent)
//           } else {
//               Toast.makeText(this@RegisterActivity,"I love you",Toast.LENGTH_SHORT).show()
//           }
//
//        }
//    }
//}

class RegisterActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var btnRegister: Button
    lateinit var etName: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var etPassword: EditText
    lateinit var etEmail: EditText
    lateinit var etAddress: EditText
    lateinit var etConfirmPassword: EditText
    lateinit var rlRegister: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Register Yourself"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rlRegister = findViewById(R.id.rlRegister)
        etName = findViewById(R.id.etName)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        etAddress = findViewById(R.id.etAddress)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data", "register")
            bundle.putString("name", etName.text.toString())
            bundle.putString("mobile", etPhoneNumber.text.toString())
            bundle.putString("password", etPassword.text.toString())
            bundle.putString("address", etAddress.text.toString())
            intent.putExtra("details", bundle)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}