package com.example.daggert.act1.di

import com.example.daggert.act1.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [MainViewModelModule::class] )
interface Act1Component {

    @Subcomponent.Factory
    interface Factory{
        fun create(): Act1Component
    }

    fun inject(mainActivity: MainActivity)

}