package com.example.daggert.act1.di

import com.example.daggert.act1.MainActivity
import com.example.daggert.act2.MainActivity2
import dagger.Subcomponent

@Subcomponent(modules = [MainViewModel2Module::class] )
interface Act2Component {

    @Subcomponent.Factory
    interface Factory{
        fun create(): Act2Component
    }

    fun inject(mainActivity: MainActivity2)

}