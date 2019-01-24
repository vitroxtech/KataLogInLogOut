package com.mytaxi.miguelgomez.kataloginlogout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginLogoutView {
    override fun showError() {
        Toast.makeText(this,"fuck",Toast.LENGTH_SHORT).show()
    }

    val presenter: LoginLogoutPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener { v ->
            presenter.onLogoutClicked()
        }

        button.setOnClickListener { v ->
            presenter.onLoginClicked(
                edituser.text.toString(),
                editPassword.text.toString()
            )
        }
    }

    override fun hideLoginForm() {
        button.visibility = GONE
        editPassword.visibility = GONE
        edituser.visibility = GONE
    }

    override fun hideLogoutForm() {
        button2.visibility = GONE
    }

    override fun showLoginForm() {
        button.visibility = VISIBLE
        editPassword.visibility = VISIBLE
        edituser.visibility = VISIBLE
    }

    override fun showLogoutForm() {
        button2.visibility = VISIBLE
    }

}


