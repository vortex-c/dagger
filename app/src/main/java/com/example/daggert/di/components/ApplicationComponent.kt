package com.example.daggert.di.components

import com.example.daggert.di.modules.NetModule
import dagger.Component

@Component(modules = [NetModule::class])
interface ApplicationComponent {
    fun componentActivityBuilder(): ViewModelComponentActivity.Builder
}