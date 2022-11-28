package com.example.daggert.di.components

import android.content.Context
import com.example.daggert.act1.di.Act1Component
import com.example.daggert.act1.di.Act2Component
import com.example.daggert.di.modules.NetModule
import com.example.daggert.di.modules.ViewModelBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Component(modules = [NetModule::class, ViewModelBuilder::class, SubComponentsModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance applicationContext:Context):ApplicationComponent
    }
//    fun componentActivityBuilder(): ViewModelComponentActivity.Builder

    fun addAct1Component():Act1Component.Factory
    fun addAct2Component():Act2Component.Factory
}

@Module(
    subcomponents = [
        Act2Component::class,
        Act1Component::class
    ]
)
object SubComponentsModule