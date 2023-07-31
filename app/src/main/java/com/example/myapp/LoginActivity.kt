package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

//class LoginActivity : AppCompatActivity(){
//    lateinit var logo: ImageView
//    lateinit var mobileNumber: EditText
//    lateinit var password: EditText
//    lateinit var login: Button
//    lateinit var forgotPassword: TextView
//    lateinit var registerYourself: TextView
//
//    var validMobileNumber = "1234567"
//    var validPassword = "Haral"
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        title = "login"
//
//        logo = findViewById(R.id.logo)
//        mobileNumber = findViewById(R.id.mobileNumber)
//        password = findViewById(R.id.password)
//        login = findViewById(R.id.login)
//        forgotPassword = findViewById(R.id.forgotPassword)
//        registerYourself = findViewById(R.id.registerYourself)
//
//
//        login.setOnClickListener {
//
//            var mobileNumber = mobileNumber.text.toString()
//            var password = password.text.toString()
//           if (validMobileNumber == mobileNumber && validPassword == password)
//           {
//               var intent = Intent(this@LoginActivity,RegisterActivity::class.java)
//               startActivity(intent)
//           } else {
//               Toast.makeText(this@LoginActivity,"having fun",Toast.LENGTH_SHORT).show()
//           }
//        }
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        finish()
//    }
//
//}
class LoginActivity : AppCompatActivity() {

    /*Declaring the different variables used for this activity*/
    private lateinit var registerYourself: TextView
    private lateinit var login: Button
    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var txtForgotPassword: TextView

    /*Life-cycle method of the activity*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Linking the view*/
        setContentView(R.layout.activity_login)


        /*Initialising the views with the ones defined in the XML*/
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        registerYourself = findViewById(R.id.txtRegisterYourself)
        login = findViewById(R.id.btnLogin)

        /*Handling the clicks using the setOnClickListener method*/
        txtForgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgotPasswordActivity::class.java))
        }
        registerYourself.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }


        login.setOnClickListener {

            /*Declaring the intent which sets up the route for the navigation of the activity*/
            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)

            /*Declaring the bundle object which will carry the data
            * You can send the data inside intents
            *
            * We specifically used Bundle just to demonstrate a new technique*/
            val bundle = Bundle()

            /*Setting a value data which is activity specific. This will be used to identify from where the data was sent*/
            bundle.putString("data", "login")

            /*Putting the values in Bundle*/
            bundle.putString("mobile", etMobileNumber.text.toString())
            bundle.putString("password", etPassword.text.toString())

            /*Putting the Bundle to be shipped with the intent*/
            intent.putExtra("details", bundle)

            /*Starting the new activity by sending the intent in the startActivity method*/
            startActivity(intent)
        }

    }
}