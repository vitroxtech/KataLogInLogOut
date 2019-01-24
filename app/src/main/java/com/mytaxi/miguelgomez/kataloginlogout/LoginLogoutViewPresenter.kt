package com.mytaxi.miguelgomez.kataloginlogout

interface LoginLogoutView {
    fun hideLoginForm()
    fun hideLogoutForm()
    fun showLoginForm()
    fun showLogoutForm()
    fun showError()
}

interface LoginLogoutPresenter {
    fun onLoginClicked(name: String, psw: String)
    fun onLogoutClicked()
}
