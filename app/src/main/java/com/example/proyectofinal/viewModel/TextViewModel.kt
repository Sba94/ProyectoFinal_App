package com.example.proyectofinal.viewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectofinal.model.TModel

class TextViewModel : ViewModel() {

        val tModel = MutableLiveData<TModel>()

        fun compareTexts(text1: String, text2: String){
                val areEqual = text1 == text2
                tModel.value = TModel(if(areEqual)"Los textos son iguales" else "Los textos no coinciden")
        }
}
