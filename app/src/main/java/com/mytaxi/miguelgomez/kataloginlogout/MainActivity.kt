package com.mytaxi.miguelgomez.kataloginlogout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val loginUseCase:LoginUseCase = LoginUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { v ->
            if (loginUseCase.execute(
                    edituser.text.toString(),
                    editPassword.text.toString()
                )
            ) {
                val intent = Intent(this, Main2Activity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "wrong bitch", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

class LoginUseCase
{
    fun  execute(user: String, psw: String): Boolean = (user == "admin" && psw == "admin")
}
