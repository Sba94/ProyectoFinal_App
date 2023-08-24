package com.example.proyectofinal.viewModel


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule

@RunWith(JUnit4::class)
@ExperimentalCoroutinesApi
class TextViewModelTest {

    private lateinit var viewModel: TextViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()

    @Before
    fun setup(){
        viewModel = TextViewModel()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun check_strings() {
        viewModel.compareTexts("hello", "hola")
        val value = viewModel.tModel.value?.text
        assertEquals("Los textos no coinciden", value)
    }
}

