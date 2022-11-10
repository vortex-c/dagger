package com.example.daggert

import android.app.Application
import com.example.daggert.di.components.DaggerApplicationComponent

class MainApplication:Application() {
    companion object{
        val appComponent = DaggerApplicationComponent.create()
    }

}