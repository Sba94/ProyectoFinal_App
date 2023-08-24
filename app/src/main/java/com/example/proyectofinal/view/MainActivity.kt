package com.example.proyectofinal.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.proyectofinal.databinding.ActivityMainBinding
import com.example.proyectofinal.viewModel.TextViewModel

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
        private val textViewModel : TextViewModel by viewModels()

        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            textViewModel.tModel.observe(this, Observer{currentText ->
                binding.textViewResult.text = currentText.text
            })

            binding.button.setOnClickListener{
                val text1 = binding.editText1.text.toString()
                val text2 = binding.editText2.text.toString()

                textViewModel.compareTexts(text1, text2)
            }
        }

}