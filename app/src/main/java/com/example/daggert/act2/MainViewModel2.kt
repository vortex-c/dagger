package com.example.daggert.act2

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

const val TAG = "MainViewModel2"

class MainViewModel2 @Inject constructor (private val repository2: MainRepository2) : ViewModel() {
    fun getUser() {
        viewModelScope.launch {
            val user = repository2.getUser()
            if(user != null) {
                Log.e(TAG, "getUser: ${user.firstName}")
            }else{
                Log.e(TAG, "getUser: Error in getting user")
            }
        }
    }

}
