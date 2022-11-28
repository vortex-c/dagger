package com.example.daggert.act1

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainViewModel @Inject constructor (val repo: MainRepository): ViewModel() {
    private val data = mutableListOf(1,2,3)
    fun getData(): List<Int> {
        return data.toList()
    }

    fun setData(l:List<Int>){
        data.addAll(l)
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("Main", "ViewModel Destroyed")
    }
}


