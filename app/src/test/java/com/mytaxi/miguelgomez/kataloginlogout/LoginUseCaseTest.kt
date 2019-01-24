package com.mytaxi.miguelgomez.kataloginlogout

import org.junit.Test

import org.junit.Assert.*

class LoginUseCaseTest {

    val loginUseCase: LoginUseCase by lazy { LoginUseCase() }

    @Test
    fun `Given user and psw admin should return true`() {
        assertTrue(loginUseCase.execute("admin","admin"))
    }

    @Test
    fun `Given user and psw not admin should return false`() {
        assertFalse(loginUseCase.execute("123","123"))

    }

    @Test
    fun `Given user admin and psw not admin should return false`() {
        assertFalse(loginUseCase.execute("admin","123"))

    }

    @Test
    fun `Given user not admin and psw admin should return false`() {
        assertFalse(loginUseCase.execute("123","admin"))

    }
}
