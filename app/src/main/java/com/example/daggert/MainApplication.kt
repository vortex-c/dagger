package com.example.daggert

import android.app.Application
import com.example.daggert.di.components.ApplicationComponent
import com.example.daggert.di.components.DaggerApplicationComponent

class MainApplication:Application() {
    val appComponent by lazy {
        initializeAppComponent()
    }

    open fun initializeAppComponent():ApplicationComponent{
        return  DaggerApplicationComponent.factory().create(applicationContext)
    }
}