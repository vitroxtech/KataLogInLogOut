package com.mytaxi.miguelgomez.kataloginlogout

class MainPresenter(val view: LoginLogoutView) : LoginLogoutPresenter {

    val loginUseCase: LoginUseCase = LoginUseCase()
    val logoutUseCase: LogoutUseCase = LogoutUseCase()

    override fun onLoginClicked(name: String, psw: String) {
        if (loginUseCase.execute(name, psw)) {
            view.hideLoginForm()
            view.showLogoutForm()
        } else {
            view.showError()
        }
    }

    override fun onLogoutClicked() {
        if (logoutUseCase.execute()) {
            view.showLoginForm()
            view.hideLogoutForm()
        } else {
            view.showError()
        }    }

}

class LoginUseCase {
    fun execute(user: String, psw: String): Boolean = (user == "admin" && psw == "admin")
}

class LogoutUseCase {
    private val tp = TimeProvider()
    fun execute(): Boolean = (tp.currentTime().toInt() % 2) == 0
}
