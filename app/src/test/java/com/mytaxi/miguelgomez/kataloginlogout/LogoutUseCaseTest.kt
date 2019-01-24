package com.mytaxi.miguelgomez.kataloginlogout

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class LogoutUseCaseTest {


    val timeProvider: TimeProvider = mock()

    val logoutUseCase: LogoutUseCase by lazy { LogoutUseCase() }


    @Test
    fun `when time is even should return true `() {
        whenever(timeProvider.currentTime()).thenReturn(2L)
        assertTrue(logoutUseCase.execute())
    }

    @Test
    fun `when time is odd should return true `() {
        whenever(timeProvider.currentTime()).thenReturn(3L)
        assertFalse(logoutUseCase.execute())
    }
}
