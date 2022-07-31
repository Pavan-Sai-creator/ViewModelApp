package com.example.viewmodelapp

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var count: Int = 0

    fun incrementCount(){
        count++
    }
}